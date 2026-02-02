package SCA;

import java.util.Collection;

public interface IValidationService {
    boolean validateUserCredentials(Collection<User> users, User user);

}
