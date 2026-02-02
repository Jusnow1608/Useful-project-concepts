package SCA;

import SCA.IValidationService;
import SCA.User;
import SCA.UserService;

import java.util.Collection;


public class ValidationService implements IValidationService {


    @Override
    public boolean validateUserCredentials(Collection<User> users, User user) {
        UserService userService = new UserService();


        User currentUser = userService.findUserByEmail(users, user.getEmail());
        if (currentUser != null) {
            return currentUser.getEmail() == user.getEmail() && currentUser.getPassword() == user.getPassword();
        }
        else
        {
            return false;
        }
    }
}
