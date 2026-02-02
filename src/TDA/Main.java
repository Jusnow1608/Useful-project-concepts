package TDA;

public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();

        System.out.println("--- SYSTEM PŁATNOŚCI TDA ---");

        try {
            // Serwis musi znać ID klienta i kwotę, a potem sam "walczyć" z obiektem konta
            paymentService.standardCustomer(50, 101); // Udana płatność
            paymentService.standardCustomer(300, 101); // To wyrzuci wyjątek
        } catch (RuntimeException e) {
            System.out.println("Błąd: " + e.getMessage());
        }
    }
}
