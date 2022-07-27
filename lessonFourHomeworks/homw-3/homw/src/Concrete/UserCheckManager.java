package Concrete;

import Abstract.UserCheckService;
import Entites.User;

public class UserCheckManager implements UserCheckService {
    @Override
    public boolean checkIfRealPerson(User user) {
        return true;
    }

    // bu sınıf mernis calismadigi zamanlarda test icin yazilmistir.



}
