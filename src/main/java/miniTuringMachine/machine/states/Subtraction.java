package miniTuringMachine.machine.states;

import miniTuringMachine.machine.model.State;
import miniTuringMachine.machine.model.StateAction;

import java.util.ArrayList;

public class Subtraction implements StatesList {

    private ArrayList<State> statesList;

    public Subtraction() {

        this.statesList = new ArrayList<State>();

        this.statesList.add(new State(0,
                new StateAction('1' ),
                new StateAction('-'),
                new StateAction('#', '#', 'R', 1)
        ));
        this.statesList.add(new State(1,
                new StateAction('1', '#', 'R', 2),
                new StateAction('-'),
                new StateAction('#')
        ));
        this.statesList.add(new State(2,
                new StateAction('1', '1', 'R', 2),
                new StateAction('-', '-', 'R', 3),
                new StateAction('#')
        ));
        this.statesList.add(new State(3,
                new StateAction('1', '1', 'R', 3),
                new StateAction('-'),
                new StateAction('#', '#', 'L', 4)
        ));
        this.statesList.add(new State(4,
                new StateAction('1', '#', 'L', 5),
                new StateAction('-'),
                new StateAction('#')
        ));
        this.statesList.add(new State(5,
                new StateAction('1', '1', 'L', 6),
                new StateAction('-', '#', 'R', 9),
                new StateAction('#')
        ));
        this.statesList.add(new State(6,
                new StateAction('1', '1', 'L', 6),
                new StateAction('-', '-', 'L', 7),
                new StateAction('#')
        ));
        this.statesList.add(new State(7,
                new StateAction('1', '1', 'L', 8),
                new StateAction('-'),
                new StateAction('#', '#', 'R', 9)
        ));
        this.statesList.add(new State(8,
                new StateAction('1', '1', 'L', 8),
                new StateAction('-'),
                new StateAction('#', '#', 'R', 1)
        ));
        this.statesList.add(new State(9,
                new StateAction('1'),
                new StateAction('-'),
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
