package miniTuringMachine;

public class Application {

    public static void main(String[] args) {

        UserInterface ui = new UserInterface();
        miniTuringMachine mtmA = new miniTuringMachine(ui.getFirstInputNumber(), ui.getSecondInputNumber(), '+');
        miniTuringMachine mtmS = new miniTuringMachine(ui.getFirstInputNumber(), ui.getSecondInputNumber(), '-');
        miniTuringMachine mtmM = new miniTuringMachine(ui.getFirstInputNumber(), ui.getSecondInputNumber(), '*');
        miniTuringMachine mtmD = new miniTuringMachine(ui.getFirstInputNumber(), ui.getSecondInputNumber(), ':');

        mtmA.start();
        mtmS.start();
        mtmM.start();
        mtmD.start();
/*
        try {

        } catch (Exception e) {
            ui.getDataAgain(e.getMessage());

            mtmD.start();
        }
*/
    }
}
