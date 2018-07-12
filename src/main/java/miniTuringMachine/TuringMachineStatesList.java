package miniTuringMachine;

import java.util.ArrayList;
import java.util.HashMap;

public class TuringMachineStatesList {

    private ArrayList<TuringMachineState> statesList;

    public TuringMachineStatesList() {

        statesList = new ArrayList<TuringMachineState>();

        statesList.add( new TuringMachineState(0,
                new TuringMachineStateAction('1','0','0',0),
                new TuringMachineStateAction('+','0','0',0),
                new TuringMachineStateAction('#','#','R',1)
                ));
        statesList.add( new TuringMachineState(1,
                new TuringMachineStateAction('1','1','R',1),
                new TuringMachineStateAction('+','1','R',1),
                new TuringMachineStateAction('#','#','L',2)
        ));
        statesList.add( new TuringMachineState(2,
                new TuringMachineStateAction('1','#','R',3),
                new TuringMachineStateAction('+','0','0',0),
                new TuringMachineStateAction('#','0','0',0)

        ));
        statesList.add( new TuringMachineState(3,
                new TuringMachineStateAction('1','0','0',0),
                new TuringMachineStateAction('+','0','0',0),
                new TuringMachineStateAction('#','0','0',0)

        ));
    }


    public TuringMachineState getState(int stateNumber)
    {
        return this.statesList.get(stateNumber);
    }




}
