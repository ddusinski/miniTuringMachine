package miniTuringMachine.machine.model;

import java.util.HashMap;

public class State {
    private final int stateNumber;
    private final HashMap<Character, StateAction> turingMachineState;

    public State(int stateNumber, StateAction... stateAction) {

        this.turingMachineState = new HashMap<Character, StateAction>();
        this.stateNumber = stateNumber;

        for (StateAction i : stateAction) {

            this.turingMachineState.put(i.getTapeSymbol(), i);
        }
    }

    public int getStateNumber() {
        return this.stateNumber;
    }

    public StateAction getStateAction(char tapeChar) {
        return this.turingMachineState.get(tapeChar);
    }


}
