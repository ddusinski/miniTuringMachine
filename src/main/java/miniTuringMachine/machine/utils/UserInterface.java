package miniTuringMachine.machine.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class UserInterface {

    private static final Logger log = LoggerFactory.getLogger(UserInterface.class);
    private static final Scanner scanner = new Scanner(System.in);
    private int firstInputNumber;
    private int secondInputNumber;
    private char operation;


    public UserInterface() {

        log.info("Welcome in Mini Turing Machine");
        System.out.println("Welcome in Mini Turing Machine");

        setFirstInput();
        setSecondInput();
        setOperation();
    }

    private void setOperation() {
        System.out.println("What operation should I calculate?: ");
        System.out.println("1 - sum ");
        System.out.println("2 - subtract ");
        System.out.println("3 - multiply ");
        System.out.println("4 - divide ");


        switch (scanner.nextInt()) {
            case 2:
                this.operation = '-';
                break;
            case 3:
                this.operation = '*';
                break;
            case 4:
                this.operation = '/';
                break;
            default:
                this.operation = '+';
        }


    }

    private void setFirstInput() {
        System.out.println("Give us first input number");
        this.firstInputNumber = scanner.nextInt();
    }

    private void setSecondInput() {
        System.out.println("Give us second input number");
        this.secondInputNumber = scanner.nextInt();
    }

    public int getFirstInputNumber() {
        return firstInputNumber;
    }

    public int getSecondInputNumber() {
        return secondInputNumber;
    }

    public char getOperation() {
        return this.operation;
    }

    public void printResult(String message) {
        System.out.println(message);
    }


}
