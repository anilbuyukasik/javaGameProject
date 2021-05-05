package Adapters;

import java.rmi.RemoteException;

import Abstract.UserValidationService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserValidationService{

	@Override
	public boolean validate(Gamer gamer) {
		KPSPublicSoap client = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(gamer.getIdentityNumber()), gamer.getFirstName().toUpperCase(), gamer.getLastName().toUpperCase(),gamer.getDateOfBirth().getYear());
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}catch(RemoteException e) {
			e.printStackTrace();
		}
		return result;
	}

}
