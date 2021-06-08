package miniTuringMachine.machine.model;

public class StateAction {

    private final char tapeSymbol;
    private final char writeSymbol;
    private final char moveDirection;
    private final int nextStateNumber;

    public StateAction(char tape, char write, char move, int go) {
        this.tapeSymbol = tape;
        this.writeSymbol = write;
        this.moveDirection = move;
        this.nextStateNumber = go;
    }

    public StateAction(char tape) {
        this.tapeSymbol = tape;
        this.writeSymbol = '0';
        this.moveDirection = '0';
        this.nextStateNumber = 0;
    }

    public char getMoveDirection() {
        return moveDirection;
    }

    public char getWriteSymbol() {
        return writeSymbol;
    }

    public int getNextStateNumber() {
        return nextStateNumber;
    }

    public char getTapeSymbol() {
        return tapeSymbol;
    }
}
