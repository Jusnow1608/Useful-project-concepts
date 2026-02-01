package KISS;

public class Main {
    public static void main(String [] args){

        // 1. Próba standardowa - to wywoła błąd krytyczny
        try {
            System.out.println("Próba utworzenia obiektu notKISSClass1");
            notKISSClass1 myObject = new notKISSClass1();
        } catch (ArithmeticException e) {
            System.out.println("BŁĄD: Konstruktor klasy nie spełnia zasady KISS.");
            System.out.println("Powód: Próba dzielenia przez zero (domyślne wartości pól num1 i num2).");
        }

        // 2. Aby użyć metody Calculate1, i tak musimy stworzyć obiekt,
        // ale w obecnej strukturze konstruktora to niemożliwe bez błędu.
        // Jeśli jednak naprawilibyśmy konstruktor, Main wyglądałby tak:
        /*
        notKISSClass1 tool = new notKISSClass1();
        int result = tool.Calculate1(10, 2);
        System.out.println("Wynik: " + result);
        */
    }
}
