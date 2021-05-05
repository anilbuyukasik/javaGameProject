package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface SalesService {
	void buy(Game game, Gamer gamer);
	void buyWithCampaign(Game game, Gamer gamer, Campaign campaign);
}
