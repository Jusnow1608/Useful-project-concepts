package KISS;

public class Main {
    public static void main(String [] args){

        try {
            NumberCalculator numberCalculator = new NumberCalculator();
            int result = numberCalculator.divideNumbers(10,2);
            System.out.println("Wynik: " + result);
        } catch (ArithmeticException e) {
            System.out.println("BŁĄD: Konstruktor klasy nie spełnia zasady KISS.");
            System.out.println("Powód: Próba dzielenia przez zero (domyślne wartości pól num1 i num2).");
        }
    }
}
