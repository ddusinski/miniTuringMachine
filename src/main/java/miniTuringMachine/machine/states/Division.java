package miniTuringMachine.machine.states;

import miniTuringMachine.machine.model.State;
import miniTuringMachine.machine.model.StateAction;

import java.util.ArrayList;

public class Division implements StatesList {
        private ArrayList<State> statesList;

        public Division() {

            this.statesList = new ArrayList<State>();

            this.statesList.add(new State(0,
                    new StateAction('1'),
                    new StateAction(':'),
                    new StateAction('E'),
                    new StateAction('Z'),
                    new StateAction('#','#','R',1)
            ));
            this.statesList.add(new State(1,
                    new StateAction('1','#','R',2),
                    new StateAction(':','#','R',11),
                    new StateAction('E'),
                    new StateAction('Z'),
                    new StateAction('#')
            ));
            this.statesList.add(new State(2,
                    new StateAction('1','1','R',3),
                    new StateAction(':',':','R',4),
                    new StateAction('E'),
                    new StateAction('Z'),
                    new StateAction('#')
            ));

            this.statesList.add(new State(3,
                    new StateAction('1','1','R',3),
                    new StateAction(':',':','R',4),
                    new StateAction('E'),
                    new StateAction('Z'),
                    new StateAction('#')
            ));
            this.statesList.add(new State(4,
                    new StateAction('1','1','R',4),
                    new StateAction(':'),
                    new StateAction('E','E','R',4),
                    new StateAction('Z','Z','L',5),
                    new StateAction('#','#','L',5)
            ));
            this.statesList.add(new State(5,
                    new StateAction('1','E','L',6),
                    new StateAction(':'),
                    new StateAction('E','E','L',5),
                    new StateAction('Z'),
                    new StateAction('#')
            ));
            this.statesList.add(new State(6,
                    new StateAction('1','1','L',9),
                    new StateAction(':',':','R',7),
                    new StateAction('E'),
                    new StateAction('Z'),
                    new StateAction('#')
            ));
            this.statesList.add(new State(7,
                    new StateAction('1'),
                    new StateAction(':'),
                    new StateAction('E','1','R',7),
                    new StateAction('Z','Z','R',7),
                    new StateAction('#','Z','L',9)
            ));
            this.statesList.add(new State(8,
                    new StateAction('1'),
                    new StateAction(':'),
                    new StateAction('E'),
                    new StateAction('Z'),
                    new StateAction('#')
            ));
            this.statesList.add(new State(9,
                    new StateAction('1','1','L',9),
                    new StateAction(':',':','L',10),
                    new StateAction('E'),
                    new StateAction('Z','Z','L',9),
                    new StateAction('#')
            ));
            this.statesList.add(new State(10,
                    new StateAction('1','1','L',10),
                    new StateAction(':'),
                    new StateAction('E'),
                    new StateAction('Z'),
                    new StateAction('#','#','R',1)
            ));
            this.statesList.add(new State(11,
                    new StateAction('1','#','R',11),
                    new StateAction(':'),
                    new StateAction('E'),
                    new StateAction('Z','1','R',11),
                    new StateAction('#','#','R',12)
            ));
            this.statesList.add(new State(12,
                    new StateAction('1'),
                    new StateAction(':'),
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
