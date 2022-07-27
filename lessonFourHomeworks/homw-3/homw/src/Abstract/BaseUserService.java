package Abstract;

import Entites.User;

public interface BaseUserService {

    void saveUser(User user) throws Exception;
    void deleteUser(User user);
    void updateUser(User user);

}
