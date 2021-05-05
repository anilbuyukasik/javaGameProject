package Concrete;

import Abstract.SalesService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SalesManager implements SalesService{

	@Override
	public void buy(Game game, Gamer gamer) {
		System.out.println(gamer.getFirstName() + " adlý oyuncu " 
	+ game.getGamePrice() + " TL tutarýndaki " + game.getGameName() + " adlý oyunu satýn aldý."); 
		
	}

	@Override
	public void buyWithCampaign(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(gamer.getFirstName() + " adlý oyuncu " 
				+ game.getGamePrice() + " TL tutarýndaki " + game.getGameName() + " adlý oyunu %"+ campaign.getcampaignRate() +" indirimle satýn aldý.\nYeni fiyat: " + (game.getGamePrice() / 100) * campaign.getcampaignRate() + " TL"); 
		
	}

}
