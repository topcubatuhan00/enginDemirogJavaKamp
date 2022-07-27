package Abstract;

import Entites.Campaign;

public interface BaseCampaignService {

    void addCampaign(Campaign campaign);
    void updateCampaign(Campaign campaign);
    void deleteCampaign(Campaign campaign);

}
