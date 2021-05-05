package Entities;

import Abstract.Entity;

public class Campaign implements Entity{
	private int campaignId;
	private String campaignName;
	private int campaignRate;
	
	public Campaign() {
		
	}
	
	public Campaign(int campaignId, String campaignName, int campaignRate) {
		this.campaignId = campaignId;
		this.campaignName = campaignName;
		this.campaignRate = campaignRate;
	}

	public int getcampaignId() {
		return campaignId;
	}

	public void setcampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public String getcampaignName() {
		return campaignName;
	}

	public void setcampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public int getcampaignRate() {
		return campaignRate;
	}

	public void setcampaignRate(int campaignRate) {
		this.campaignRate = campaignRate;
	}
}
