package odevCamp4;

public class SaleManager implements SaleService{

	@Override
	public void sale(Campaign campaign, Gamer gamer, Game game) {
			
			System.out.println("Sat�lan oyunun ad�:"+" "+game.getGameName()+" "+"sat�n alan oyuncu:"+" "+gamer.getFirstName()+" "+gamer.getLastName()+
					" "+"yararland��� kampanya:"+" "+campaign.getCampaignName());
		
	}
		

}
