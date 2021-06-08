package miniTuringMachine;

import miniTuringMachine.machine.model.Machine;

public class Application {

    public static void main(String[] args) {

        UserInterface ui = new UserInterface();
        Machine mtmA = new Machine(ui.getFirstInputNumber(), ui.getSecondInputNumber(), '+');
        Machine mtmS = new Machine(ui.getFirstInputNumber(), ui.getSecondInputNumber(), '-');
        Machine mtmM = new Machine(ui.getFirstInputNumber(), ui.getSecondInputNumber(), '*');
        Machine mtmD = new Machine(ui.getFirstInputNumber(), ui.getSecondInputNumber(), ':');

        mtmA.start();
//        mtmS.start();
//        mtmM.start();
//        mtmD.start();
/*
        try {

        } catch (Exception e) {
            ui.getDataAgain(e.getMessage());

            mtmD.start();
        }
*/
    }
}
