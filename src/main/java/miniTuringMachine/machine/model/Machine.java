package miniTuringMachine.machine.model;

import miniTuringMachine.machine.states.*;

public class Machine {

    private Tape tape;
    private StatesList statesList;
    private final char machineOperation;

    public Machine(int firstNumber, int secondNumber, char operation) {
        this.machineOperation = operation;
        calculate(firstNumber, secondNumber, operation);
    }

    private void calculateAddition(int firstNumber, int secondNumber) {
        this.tape = Tape.createAdditionTape(firstNumber, secondNumber);
        this.statesList = new Addition();
    }

    private void calculateSubtraction(int firstNumber, int secondNumber) {
        this.tape = Tape.createSubtractionTape(firstNumber, secondNumber);
        this.statesList = new Subtraction();
    }

    private void calculateMultiplication(int firstNumber, int secondNumber) {
        this.tape = Tape.createMultiplicationTape(firstNumber, secondNumber);
        this.statesList = new Multiplication();
    }

    private void calculateDivision(int firstNumber, int secondNumber) {
        this.tape = Tape.createDivisionTape(firstNumber, secondNumber);
        this.statesList = new Division();
    }

    private void calculate(int firstNumber, int secondNumber, char operation) {
        switch (operation) {
            case '+':
                calculateAddition(firstNumber, secondNumber);
                break;
            case '-':
                calculateSubtraction(firstNumber, secondNumber);
                break;
            case '*':
                calculateMultiplication(firstNumber, secondNumber);
                break;
            case ':':
                calculateDivision(firstNumber, secondNumber);
                break;
        }

        Head head = new Head(this.statesList, this.tape);
        head.run();
    }

    public String showResult() {
        return "Operation: " + this.machineOperation +
                " Decimal result:" + this.tape.getDecimalTape();
    }
}
