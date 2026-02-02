package SCA;

import java.util.Collection;

public interface IUserService {
    void registerUser(Collection<User> users, User user);
    User findUserByEmail(Collection<User> users, String email);
    boolean validateUserCredentials(Collection<User> users, User user);
    void logUserActivity(User user, String pathToLog);
}
