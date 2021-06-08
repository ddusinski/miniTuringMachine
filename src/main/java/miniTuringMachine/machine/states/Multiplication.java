package miniTuringMachine.machine.states;

import miniTuringMachine.machine.model.State;
import miniTuringMachine.machine.model.StateAction;

import java.util.ArrayList;

public class Multiplication implements StatesList {

    private ArrayList<State> statesList;

    public Multiplication() {

        this.statesList = new ArrayList<State>();

        this.statesList.add(new State(0,
                new StateAction('1'),
                new StateAction('*'),
                new StateAction('E'),
                new StateAction('Z'),
                new StateAction('#', '#', 'R', 1)
        ));

        this.statesList.add(new State(1,
                new StateAction('1', '#', 'R', 2),
                new StateAction('*'),
                new StateAction('E'),
                new StateAction('Z'),
                new StateAction('#')
        ));

        this.statesList.add(new State(2,
                new StateAction('1', '1', 'R', 5),
                new StateAction('*', '1', 'R', 3),
                new StateAction('E'),
                new StateAction('Z'),
                new StateAction('#')
        ));
        this.statesList.add(new State(3,
                new StateAction('1', '1', 'R', 3),
                new StateAction('*'),
                new StateAction('E'),
                new StateAction('Z', '1', 'R', 3),
                new StateAction('#', '#', 'L', 4)
        ));
        this.statesList.add(new State(4,
                new StateAction('1', '#', 'R', 11),
                new StateAction('*'),
                new StateAction('E'),
                new StateAction('Z'),
                new StateAction('#')
        ));
        this.statesList.add(new State(5,
                new StateAction('1', '1', 'R', 5),
                new StateAction('*', '*', 'R', 6),
                new StateAction('E'),
                new StateAction('Z'),
                new StateAction('#')
        ));
        this.statesList.add(new State(6,
                new StateAction('1', 'E', 'R', 7),
                new StateAction('*'),
                new StateAction('E'),
                new StateAction('Z', 'Z', 'L', 9),
                new StateAction('#')
        ));
        this.statesList.add(new State(7,
                new StateAction('1', '1', 'R', 7),
                new StateAction('*'),
                new StateAction('E'),
                new StateAction('Z', 'Z', 'R', 7),
                new StateAction('#', 'Z', 'L', 8)
        ));
        this.statesList.add(new State(8,
                new StateAction('1', '1', 'L', 8),
                new StateAction('*'),
                new StateAction('E', 'E', 'R', 6),
                new StateAction('Z', 'Z', 'L', 8),
                new StateAction('#')
        ));
        this.statesList.add(new State(9,
                new StateAction('1'),
                new StateAction('*', '*', 'L', 10),
                new StateAction('E','1', 'L', 9),
                new StateAction('Z'),
                new StateAction('#')
        ));
        this.statesList.add(new State(10,
                new StateAction('1', '1', 'L', 10),
                new StateAction('*'),
                new StateAction('E'),
                new StateAction('Z'),
                new StateAction('#','#','R',1)
        ));
        this.statesList.add(new State(11,
                new StateAction('1'),
                new StateAction('*'),
                new StateAction('E'),
                new StateAction('Z'),
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
