package miniTuringMachine.machine.states;

import miniTuringMachine.machine.model.State;
import miniTuringMachine.machine.model.StateAction;

import java.util.ArrayList;

public class Addition implements StatesList {

    private ArrayList<State> statesList;

    public Addition() {

        this.statesList = new ArrayList<State>();

        this.statesList.add(new State(0,
                new StateAction('1'),
                new StateAction('+'),
                new StateAction('#', '#', 'R', 1)
        ));
        this.statesList.add(new State(1,
                new StateAction('1', '1', 'R', 1),
                new StateAction('+', '1', 'R', 1),
                new StateAction('#', '#', 'L', 2)
        ));
        this.statesList.add(new State(2,
                new StateAction('1', '#', 'R', 3),
                new StateAction('+'),
                new StateAction('#')
        ));
        this.statesList.add(new State(3,
                new StateAction('1'),
                new StateAction('+'),
                new StateAction('#')
        ));

    }

    public State getState(int stateNumber) {
        return this.statesList.get(stateNumber);
    }

    public int getMaxStatesNumber()
    {
        return this.statesList.size()-1;
    }





}
