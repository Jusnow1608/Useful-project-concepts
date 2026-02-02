package SCA;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<User> userDatabase = new ArrayList<>();


        IUserService userService = new UserService();
        IActivityService activityService = new ActivityService();
        IValidationService validationService = new ValidationService();


        User user = new User("hamster@studio.pl", "Pass123");


        userService.registerUser(userDatabase, user);
        System.out.println("Zarejestrowano użytkownika.");


        System.out.println("Zwalidowano: " + validationService.validateUserCredentials(userDatabase, user));


        activityService.logUserActivity(user, "activity_logs.txt");
        System.out.println("Zapisano aktywność do pliku.");
    }
}
