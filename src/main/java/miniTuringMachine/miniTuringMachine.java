package miniTuringMachine;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Scanner;

public class miniTuringMachine extends Thread {

    private static final Logger log = LoggerFactory.getLogger(miniTuringMachine.class);
    private static final Scanner scanner = new Scanner(System.in);

    private TuringMachineTape turingMachineTape;
    private TuringMachineStatesList statesList;
    private TuringMachineHead head;
    private int firstInputNumber;
    private int secondInputNumber;
    private char machineOperation;
    private long liveTime;

    private Thread turingMachineThread;

    public miniTuringMachine(int firstNumber, int secondNumber, char operation) {
        this.firstInputNumber = firstNumber;
        this.secondInputNumber = secondNumber;
        this.machineOperation = operation;
        this.turingMachineTape = new TuringMachineTape();

    }

    private void calculateAddition() {
        this.turingMachineTape.createAdditionTape(this.firstInputNumber, this.secondInputNumber);
        this.statesList = new TuringMachineStatesListAddition();
    }

    private void calculateSubtraction() {
        this.turingMachineTape.createSubtractionTape(this.firstInputNumber, this.secondInputNumber);
        this.statesList = new TuringMachineStatesListSubtraction();
    }

    private void calculateMultiplication() {
        this.turingMachineTape.createMultiplicationTape(this.firstInputNumber, this.secondInputNumber);
        this.statesList = new TuringMachineStatesListMultiplication();
    }

    private void calculateDivision() {
        this.turingMachineTape.createDivisionTape(this.firstInputNumber, this.secondInputNumber);
        this.statesList = new TuringMachineStatesListDivision();
    }

    public void run() {
        long startTime = System.nanoTime();

        switch (this.machineOperation) {
            case '+':
                calculateAddition();
                break;
            case '-':
                calculateSubtraction();
                break;
            case '*':
                calculateMultiplication();
                break;
            case ':':
                calculateDivision();
                break;
        }

        this.head = new TuringMachineHead(this.statesList, this.turingMachineTape);
        this.liveTime = System.nanoTime() - startTime;
        showResult();
    }

    private void showResult() {
        //"The Result Tape: "+ this.turingMachineTape.getTape() +
        log.info("Operation: " + String.valueOf(machineOperation) +
                " Decimal:" + String.valueOf(this.turingMachineTape.getDecimalTape()) +
                " Live time of thread: " + String.valueOf((this.liveTime) / 1000)
        );

    }


}
