package miniTuringMachine;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TuringMachineHead {
    private TuringMachineStatesList statesList;
    private TuringMachineTape tape;
    private TuringMachineState tempState;

    private static final Logger log = LoggerFactory.getLogger(TuringMachineHead.class);


    public TuringMachineHead(TuringMachineStatesList statesList, TuringMachineTape tape) {
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

    private TuringMachineStateAction getStateAction(char tapeChar) {
        return this.tempState.getStateAction(tapeChar);
    }

    private void computeState() {
        TuringMachineStateAction tempStateAction = getStateAction(this.tape.readTape());
        this.tape.writeOnTape(tempStateAction.getWriteSymbol());
        if (tempStateAction.getMoveDirection() == 'R') {
            this.tape.moveTapeNext();
        } else {
            this.tape.moveTapePrevious();
        }
        setState(tempStateAction.getNextStateNumber());
    }

}
