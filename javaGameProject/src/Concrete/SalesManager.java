package Concrete;

import Abstract.SalesService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SalesManager implements SalesService{

	@Override
	public void buy(Game game, Gamer gamer) {
		System.out.println(gamer.getFirstName() + " adl� oyuncu " 
	+ game.getGamePrice() + " TL tutar�ndaki " + game.getGameName() + " adl� oyunu sat�n ald�."); 
		
	}

	@Override
	public void buyWithCampaign(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(gamer.getFirstName() + " adl� oyuncu " 
				+ game.getGamePrice() + " TL tutar�ndaki " + game.getGameName() + " adl� oyunu %"+ campaign.getcampaignRate() +" indirimle sat�n ald�.\nYeni fiyat: " + (game.getGamePrice() / 100) * campaign.getcampaignRate() + " TL"); 
		
	}

}
