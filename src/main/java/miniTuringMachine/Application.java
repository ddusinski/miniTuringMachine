package miniTuringMachine;

public class Application {

    public static void main(String[] args) {

        UserInterface ui =new UserInterface();
        miniTuringMachine mtm = new miniTuringMachine(ui.getFirstInputNumber(),ui.getSecondInputNumber());
        mtm.getTape();
        mtm.decimalResult();
    }
}
