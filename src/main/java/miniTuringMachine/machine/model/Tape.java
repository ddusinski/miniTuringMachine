package miniTuringMachine.machine.model;

public class Tape {

    private String tapeString;
    private int tapePosition;

    public Tape(String newString){
        this.tapeString=newString;
        this.tapePosition=0;
    }

    public void moveTapeNext() {
        this.tapePosition++;
    }

    public void moveTapePrevious() {
        this.tapePosition--;
    }

    public char readTape() {
        try {
            return tapeString.charAt(tapePosition);
        } catch (StringIndexOutOfBoundsException e) {
            StringBuilder sb = new StringBuilder(this.tapeString);
            sb.append("#");
            this.tapeString = sb.toString();
        }

        return tapeString.charAt(tapePosition);
    }

    private static String convertToUnarySystem(int inputNumber) {
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < inputNumber; i++) {
            sb.append("1");
        }
        return sb.toString();
    }

    private static Tape createTape(int firstNumber, int secondNumber, String operation) {
        String firstInputUnaryNumber = convertToUnarySystem(firstNumber);
        String secondInputUnaryNumber = convertToUnarySystem(secondNumber);
        StringBuilder sb = new StringBuilder("#");
        sb.append(firstInputUnaryNumber);
        sb.append(operation);
        sb.append(secondInputUnaryNumber);
        sb.append("#");
        return new Tape(sb.toString());
    }

    public static Tape createAdditionTape(int firstNumber, int secondNumber) {
        return createTape(firstNumber, secondNumber, "+");
    }

    public static Tape createSubtractionTape(int firstNumber, int secondNumber) {
        return createTape(firstNumber, secondNumber, "-");
    }

    public static Tape createMultiplicationTape(int firstNumber, int secondNumber) {
        return createTape(firstNumber, secondNumber, "*");
    }

    public static Tape createDivisionTape(int firstNumber, int secondNumber) {
        if (firstNumber%secondNumber==0) {
            return createTape(firstNumber, secondNumber, ":");
        }
        else throw new IllegalArgumentException("Input is not distributable");
    }

    public String getTape() {
        return tapeString;
    }

    public int getDecimalTape() {
        int result = 0;
        short sign = 1;
        for (int i = 0; i < this.tapeString.length(); i++) {
            if (this.tapeString.charAt(i) == '1') {
                result++;
            }
            if (this.tapeString.charAt(i) == '-') {
                sign = -1;
            }
        }
        return result * sign;
    }

    public void writeOnTape(char newValue) {
        StringBuilder sb = new StringBuilder(this.tapeString);
        sb.setCharAt(this.tapePosition, newValue);
        this.tapeString = sb.toString();
    }

}


