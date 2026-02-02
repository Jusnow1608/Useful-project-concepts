package SCA;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.Instant;
import java.util.Collection;
public class UserService implements IUserService{
    @Override
    public void registerUser(Collection<User> users, User user) {
        users.add(user);
    }


    @Override
    public User findUserByEmail(Collection<User> users, String email) {
        return users.stream()
                .filter(u -> u.getEmail().equals(email))
                .findFirst()
                .orElse(null);
    }


    @Override
    public boolean validateUserCredentials(Collection<User> users, User user) {
        User found = findUserByEmail(users, user.getEmail());
        if (found != null) {
            return found.getPassword().equals(user.getPassword());
        }
        return false;
    }


    @Override
    public void logUserActivity(User user, String pathToLog) {
// Mieszanie logiki plikowej z logiką użytkownika
        try (PrintWriter out = new PrintWriter(new FileWriter(pathToLog, true))) {
            out.println("User: " + user.getEmail() + " logged at " + Instant.now());
        } catch (IOException e) {
            System.err.println("Błąd zapisu logów: " + e.getMessage());
        }
    }
}
