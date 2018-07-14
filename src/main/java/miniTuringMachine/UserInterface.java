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
        log.info("Welcome in Mini Turing Machine");
        setFirstInput();
        setSecondInput();
    }

    public void getDataAgain(String againGettingReason)
    {
        log.info("Give Data Again because of" + againGettingReason);
        setFirstInput();
        setSecondInput();
    }

    private void setFirstInput() {
        log.info("Give us first input number");
        this.firstInputNumber = scanner.nextInt();
    }

    private void setSecondInput() {
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
