import Abstract.BaseUserManager;
import Abstract.SellManager;
import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.UserManager;
import Concrete.UsualSellManager;
import Entites.Campaign;
import Entites.User;

public class Main {
    public static void main(String[] args) throws Exception {

        User user1 = new User("Batuhan","Topçu","19382866104",2002);
        Campaign campaign1 = new Campaign("Pepsi",1,10);


        BaseUserManager userManager = new UserManager(new MernisServiceAdapter());
        userManager.saveUser(user1);

        SellManager sellManager = new UsualSellManager();
        sellManager.sell(user1, campaign1);

        CampaignManager campaignManager = new CampaignManager();
        campaignManager.addCampaign(campaign1);
        campaignManager.updateCampaign(campaign1);

    }
}
