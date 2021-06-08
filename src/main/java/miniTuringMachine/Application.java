package miniTuringMachine;

import miniTuringMachine.machine.model.Machine;
import miniTuringMachine.machine.utils.UserInterface;

public class Application {

    public static void main(String[] args) {

        UserInterface ui = new UserInterface();
        Machine mtmA = new Machine(ui.getFirstInputNumber(), ui.getSecondInputNumber(), ui.getOperation());
        ui.printResult(mtmA.showResult());

    }
}
