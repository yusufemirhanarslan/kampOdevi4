package odevCamp4;

public class GamerCheck{
	
	public static void check(Gamer gamer,EDevletInfo devletInfo) {
		
			if(gamer.getNationalIdentity().equals(devletInfo.getTcNo()) && gamer.getFirstName().equals(devletInfo.getAd()) && gamer.getLastName().equals(devletInfo.getSoyad())&&
					gamer.getBirthDay().equals(devletInfo.getDogumTarihi())) {
				
				System.out.println("Giri� ba�ar�l�");
			}else {
				System.out.println("Giri� ba�ar�s�z");
			}
	}
	
	

}
