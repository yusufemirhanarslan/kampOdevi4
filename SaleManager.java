package odevCamp4;

public class SaleManager implements SaleService{

	@Override
	public void sale(Campaign campaign, Gamer gamer, Game game) {
			
			System.out.println("Satýlan oyunun adý:"+" "+game.getGameName()+" "+"satýn alan oyuncu:"+" "+gamer.getFirstName()+" "+gamer.getLastName()+
					" "+"yararlandýðý kampanya:"+" "+campaign.getCampaignName());
		
	}
		

}
