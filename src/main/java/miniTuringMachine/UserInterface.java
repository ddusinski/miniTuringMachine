package miniTuringMachine;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class UserInterface {

    private static final Logger log = LoggerFactory.getLogger(UserInterface.class);
    private static final Scanner scanner = new Scanner(System.in);

    private int firstInputNumber;
    private int secondInputNumber;


    public UserInterface() {
        writeWelcome();
        setFirstInput();
        setSecondInput();
    }


    public void writeWelcome() {
        log.info("Welcome in Mini Turing Machine");
    }

    public void setFirstInput() {
        log.info("Give us first input number");
        this.firstInputNumber = scanner.nextInt();
    }

    public void setSecondInput() {
        log.info("Give us second input number");
        this.secondInputNumber = scanner.nextInt();
    }

    public int getFirstInputNumber() {
        return firstInputNumber;
    }

    public int getSecondInputNumber() {
        return secondInputNumber;
    }
}
