package Adapters;

import Abstract.UserCheckService;
import Entites.User;
import mernisReferance.PGRKPSPublicSoap;

public class MernisServiceAdapter implements UserCheckService {

    PGRKPSPublicSoap client = new PGRKPSPublicSoap();

    @Override
    public boolean checkIfRealPerson(User user) throws Exception {
        System.out.println("debug");
        return client.TCKimlikNoDogrula(Long.valueOf(user.getNationalityId()), user.getName(), user.getLastName(), user.getYearOfBirth());

    }
}
