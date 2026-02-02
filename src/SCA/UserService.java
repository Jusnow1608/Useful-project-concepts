package SCA;

import java.util.Collection;

public class UserService implements IUserService {
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

}