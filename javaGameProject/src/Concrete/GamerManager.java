package Concrete;

import Abstract.GamerService;
import Abstract.UserValidationService;
import Entities.Gamer;

public class GamerManager implements GamerService{
	
	UserValidationService uservalidationservice;

	public GamerManager(UserValidationService uservalidationservice) {
		this.uservalidationservice = uservalidationservice;
	}

	@Override
	public void add(Gamer gamer) {
		if(uservalidationservice.validate(gamer)==true) {
			System.out.println(gamer.getFirstName() + " adlý oyuncu kayýt oldu.");
		}else {
			System.out.println("Doðrulama baþarýsýz.");
		}
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu bilgileri güncellendi.");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu kaydý silindi.");
		
	}

}
