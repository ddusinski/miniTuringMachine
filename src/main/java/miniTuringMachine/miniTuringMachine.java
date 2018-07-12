package miniTuringMachine;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class miniTuringMachine {

    private static final Logger log = LoggerFactory.getLogger(miniTuringMachine.class);
    private static final Scanner scanner = new Scanner(System.in);


    private TuringMachineTape turingMachineTape;
    private TuringMachineStatesList statesList;
    private TuringMachineHead head;

    public miniTuringMachine(int firstNumber, int secondNumber)
    {
        this.turingMachineTape = new TuringMachineTape(firstNumber,secondNumber);
        this.statesList = new TuringMachineStatesList();
        this.head = new TuringMachineHead(this.statesList,this.turingMachineTape);

    }

    public void getTape() {
         log.info(turingMachineTape.getTape());
    }

    public void decimalResult()
    {
        log.info("The Result: " + String.valueOf(turingMachineTape.getDecimalTape()));

    }
}
