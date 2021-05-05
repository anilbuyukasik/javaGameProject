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
			System.out.println(gamer.getFirstName() + " adl� oyuncu kay�t oldu.");
		}else {
			System.out.println("Do�rulama ba�ar�s�z.");
		}
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu bilgileri g�ncellendi.");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu kayd� silindi.");
		
	}

}
