package miniTuringMachine.machine.model;

import miniTuringMachine.machine.states.StatesList;

public class Head {
    private final StatesList statesList;
    private final Tape tape;
    private State tempState;

    public Head(StatesList statesList, Tape tape) {
        this.statesList = statesList;
        this.tape = tape;
    }

    public void run() {
        setState(0);
        int operationNumber = 0;
        int tempStateNumber = this.tempState.getStateNumber();

        while (tempStateNumber != this.statesList.getMaxStatesNumber()) {
            computeState();
            tempStateNumber = this.tempState.getStateNumber();
            System.out.println(operationNumber + "  " + this.tape.getTape());
            operationNumber++;
        }
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
        setState(tempStateAction.getNextStateNumber());
    }

}
