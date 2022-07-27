package Abstract;

import Entites.User;

public interface UserCheckService {

    boolean checkIfRealPerson(User user) throws Exception;

}
