package miniTuringMachine.machine.model;

import miniTuringMachine.machine.states.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Scanner;

public class Machine extends Thread {

    private static final Logger log = LoggerFactory.getLogger(Machine.class);
    private static final Scanner scanner = new Scanner(System.in);

    private Tape tape;
    private StatesList statesList;
    private Head head;
    private int firstInputNumber;
    private int secondInputNumber;
    private char machineOperation;
    private long liveTime;

    private Thread turingMachineThread;

    public Machine(int firstNumber, int secondNumber, char operation) {
        this.firstInputNumber = firstNumber;
        this.secondInputNumber = secondNumber;
        this.machineOperation = operation;
        this.tape = new Tape();

    }

    private void calculateAddition() {
        this.tape.createAdditionTape(this.firstInputNumber, this.secondInputNumber);
        this.statesList = new Addition();
    }

    private void calculateSubtraction() {
        this.tape.createSubtractionTape(this.firstInputNumber, this.secondInputNumber);
        this.statesList = new Subtraction();
    }

    private void calculateMultiplication() {
        this.tape.createMultiplicationTape(this.firstInputNumber, this.secondInputNumber);
        this.statesList = new Multiplication();
    }

    private void calculateDivision() {
        this.tape.createDivisionTape(this.firstInputNumber, this.secondInputNumber);
        this.statesList = new Division();
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

        this.head = new Head(this.statesList, this.tape);
        this.liveTime = System.nanoTime() - startTime;
        showResult();
    }

    private void showResult() {
        //"The Result Tape: "+ this.turingMachineTape.getTape() +
        log.info("Operation: " + String.valueOf(machineOperation) +
                " Decimal:" + String.valueOf(this.tape.getDecimalTape()) +
                " Live time of thread: " + String.valueOf((this.liveTime) / 1000)
        );

    }


}
