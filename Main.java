package odevCamp4;

public class Main {

	public static void main(String[] args) {
		
		Gamer gamer = new Gamer("12345678910", "Yusuf", "Arslan", "03/10/1999");
		EDevletInfo devletInfo = new EDevletInfo("12345678910", "Yusuf", "Arslan", "03/10/1999");
		Game game = new Game(12345, "Forza Horizon 4", "Multiplayer araba oyunu", 139);
		Campaign campaign = new Campaign("Bahar Fýrsatý", "2 Mayýs 2021 saat 18.00","28 Mayýs 2021 saat 18.00",35); 
		
		GamerCustomer customer = new GamerCustomer();
		customer.signUp(gamer);
		customer.update(gamer);
		customer.delete(gamer);
		
		GamerCheck.check(gamer, devletInfo);
		
		GameManager gameManager= new GameManager();
		gameManager.add(game);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		
		SaleManager saleManager = new SaleManager();
		saleManager.sale(campaign, gamer, game);
	}

}
