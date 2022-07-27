package Concrete;

import Abstract.BaseCampaignService;
import Entites.Campaign;

public class CampaignManager implements BaseCampaignService {


    @Override
    public void addCampaign(Campaign campaign) {
        System.out.println("Campaign Added : " + campaign.getCampaignName());
    }

    @Override
    public void updateCampaign(Campaign campaign) {
        System.out.println("Campaign Updated : " + campaign.getCampaignName());
    }

    @Override
    public void deleteCampaign(Campaign campaign) {
        System.out.println("Campaign Deleted : " + campaign.getCampaignName());
    }
}
