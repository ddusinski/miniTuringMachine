package miniTuringMachine;


public class TuringMachineTape {

    private String tape;
    private int tapePosition;

    public TuringMachineTape(int firstNumber, int secondNumber) {

        this.tape = createTape(convertToUnarySystem(firstNumber),convertToUnarySystem(secondNumber));
        this.tapePosition = 0;
    }

    public void moveTapeNext() {
        this.tapePosition++;
        // tape.charAt(tapePosition);
    }

    public void moveTapePrevious() {
        this.tapePosition--;
        //return tape.charAt(tapePosition);
    }

    public char readTape()
    {
        return tape.charAt(tapePosition);
    }

    private String convertToUnarySystem(int inputNumber) {
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < inputNumber; i++) {
            sb.append("1");
        }
        return sb.toString();
    }

    private String createTape(String firstInputUnaryNumber, String secondInputUnaryNumber)
    {
        StringBuilder sb = new StringBuilder("#");
        sb.append(firstInputUnaryNumber);
        sb.append("+");
        sb.append(secondInputUnaryNumber);
        sb.append("#");
        return sb.toString();
    }

    public String getTape() {
        return tape;
    }

    public int getDecimalTape()
    {
        int result = 0;
        for (int i = 0; i < this.tape.length(); i++) {
            if (this.tape.charAt(i)=='1') {
                result++;
            }
        }

        return result;
    }
    public void writeOnTape(char newValue)
    {
        StringBuilder sb = new StringBuilder(this.tape);

        sb.setCharAt(this.tapePosition,newValue);
        this.tape=sb.toString();

    }

}
