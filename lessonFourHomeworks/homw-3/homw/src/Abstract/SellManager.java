package Abstract;

import Entites.Campaign;
import Entites.User;

public abstract class SellManager {

    public void sell(User user){
        System.out.println("Items sold to : "+user.getName());
    }

    public void sell(User user, Campaign campaign){
        System.out.println("Item sold to : "+user.getName()+" with "+campaign.getCampaignName()+" campaign.");
    }

}
