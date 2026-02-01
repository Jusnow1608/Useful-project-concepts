package KISS;

public class NumberCalculator {
    public int number1;
    public int number2;
    public int result;

    public NumberCalculator()
    {
        result = divideNumbers(number1,number2);
    }

    public int divideNumbers(int number1, int number2)
    {
        return number1 / number2;
    }

        public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }


}
