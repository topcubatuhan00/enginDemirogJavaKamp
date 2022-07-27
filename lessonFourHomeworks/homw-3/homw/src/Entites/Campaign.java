package Entites;

public class Campaign {

    private String campaignName;
    private int id;
    private int discount;

    public Campaign(String campaignName, int id, int discount){
        this.campaignName = campaignName;
        this.id = id;
        this.discount = discount;
    }

    public String getCampaignName() { return campaignName; }
    public void setCampaignName(String campaignName) { this.campaignName = campaignName; }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getDiscount() { return discount; }
    public void setDiscount(int discount) { this.discount = discount; }

}
