package miniTuringMachine.machine.model;

import miniTuringMachine.machine.states.StatesList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Head {
    private StatesList statesList;
    private Tape tape;
    private State tempState;

    private static final Logger log = LoggerFactory.getLogger(Head.class);


    public Head(StatesList statesList, Tape tape) {
        this.statesList = statesList;
        this.tape = tape;
        run();
    }

    private void run() {
        setState(0);
        int operationNumber=0;

        //log.info(this.tape.getTape() + "  "+this.statesList.getMaxStatesNumber());

        int tempStateNumber = this.tempState.getStateNumber();

        while (tempStateNumber != this.statesList.getMaxStatesNumber()) {
            computeState();
            tempStateNumber = this.tempState.getStateNumber();
            operationNumber++;
            //log.info(this.tape.getTape() + " @ " +tempStateNumber+ " @" +operationNumber);
        }

        //log.info(String.valueOf(operationNumber));
    }

    private void setState(int stateNumber) {
        this.tempState = statesList.getState(stateNumber);
    }

    private StateAction getStateAction(char tapeChar) {
        return this.tempState.getStateAction(tapeChar);
    }

    private void computeState() {
        StateAction tempStateAction = getStateAction(this.tape.readTape());
        this.tape.writeOnTape(tempStateAction.getWriteSymbol());
        if (tempStateAction.getMoveDirection() == 'R') {
            this.tape.moveTapeNext();
        } else {
            this.tape.moveTapePrevious();
        }
        System.out.println(this.tape.getTape());
        setState(tempStateAction.getNextStateNumber());
    }

}
