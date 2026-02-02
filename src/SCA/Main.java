package SCA;


import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<User> userDatabase = new ArrayList<>();
        IUserService userService = new UserService();


        User user = new User("hamster@studio.pl", "Pass123");


        // Rejestracja i walidacja
        userService.registerUser(userDatabase, user);
        System.out.println("Zwalidowano: " + userService.validateUserCredentials(userDatabase, user));


        // Musimy podać ścieżkę do pliku - to łamie SoC
        userService.logUserActivity(user, "activity_logs.txt");
    }
}
