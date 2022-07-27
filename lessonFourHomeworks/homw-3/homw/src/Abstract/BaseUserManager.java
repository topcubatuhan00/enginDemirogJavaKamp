package Abstract;

import Entites.User;

public abstract class BaseUserManager implements  BaseUserService{


    @Override
    public void saveUser(User user) throws Exception {
        System.out.println("User saved : "+user.getName());
    }

    @Override
    public void deleteUser(User user) {
        System.out.println("User deleted : "+user.getName());
    }

    @Override
    public void updateUser(User user) {
        System.out.println("User updated : "+user.getName());
    }

}
