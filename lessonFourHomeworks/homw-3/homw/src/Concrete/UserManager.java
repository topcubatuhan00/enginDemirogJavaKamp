package Concrete;

import Abstract.BaseUserManager;
import Abstract.UserCheckService;
import Entites.User;

public class UserManager extends BaseUserManager {

    private UserCheckService userCheckService;

    public UserManager(UserCheckService userCheckService){
        this.userCheckService = userCheckService;
    }

    @Override
    public void saveUser(User user) throws Exception {
        if(userCheckService.checkIfRealPerson(user)){
            super.saveUser(user);
        }else{
            throw new Exception("Not a valid person");
        }
    }

}
