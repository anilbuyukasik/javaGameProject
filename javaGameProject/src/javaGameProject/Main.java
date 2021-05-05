package javaGameProject;

import java.time.LocalDate;

import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SalesManager;
import Concrete.UserValidationManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		Gamer gamer1 = new Gamer(1,"Anýl","Büyükaþýk",LocalDate.of(1995, 3, 10),"50000000000");
		Gamer gamer2 = new Gamer(2, "Engin", "Demioð", LocalDate.of(1985, 1, 6), "20000000000");
		
		GamerManager gamerManager1 = new GamerManager(new MernisServiceAdapter());
		GamerManager gamerManager2 = new GamerManager(new UserValidationManager());
		gamerManager1.add(gamer1);
		gamerManager2.add(gamer2);
		
		System.out.println("-----------------------------------------------------");
		
		Game game1 = new Game(1, "Assassin's Creed", 179.90);
		Game game2 = new Game(2, "The Forest", 39.90);
		
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		gameManager.add(game2);
		
		System.out.println("-----------------------------------------------------");
		
		Campaign campaign1 = new Campaign(1, "Black Friday", 70);
		Campaign campaign2 = new Campaign(2, "Kýþ Ýndirimleri", 60);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.add(campaign2);
		
		System.out.println("-----------------------------------------------------");
		
		SalesManager salesManager = new SalesManager();
		salesManager.buy(game1, gamer1);
		salesManager.buyWithCampaign(game2, gamer2, campaign1);

	}

}
