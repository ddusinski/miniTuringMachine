package miniTuringMachine.machine.states;

import miniTuringMachine.machine.model.State;

public interface StatesList {

    State getState(int stateNumber);
    int getMaxStatesNumber();

}
