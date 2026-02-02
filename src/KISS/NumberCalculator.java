package KISS;

public class NumberCalculator {
    public int number1;
    public int number2;
    public int result;

    public static int divideNumbers(int number1, int number2)
    {
        if (number2 == 0) {
            return 0;
        }
        return number1 / number2;
    }
    }
