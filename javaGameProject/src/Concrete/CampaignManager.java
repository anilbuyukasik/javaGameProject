package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getcampaignName() + " kampanyası eklendi.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getcampaignName() + " kampanyası güncellendi.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getcampaignName() + " kampanyası silindi.");
		
	}

}
