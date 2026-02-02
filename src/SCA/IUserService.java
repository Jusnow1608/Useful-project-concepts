package SCA;

import java.util.Collection;

public interface IUserService {
    void registerUser(Collection<User> users, User user);
    User findUserByEmail(Collection<User> users, String email);
}
