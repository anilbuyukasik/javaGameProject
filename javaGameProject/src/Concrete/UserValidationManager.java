package Concrete;

import Abstract.UserValidationService;
import Entities.Gamer;

public class UserValidationManager implements UserValidationService{

	@Override
	public boolean validate(Gamer gamer) {
		
		return true;
	}

}
