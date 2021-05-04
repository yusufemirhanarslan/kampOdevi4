package odevCamp4;

public class Game {
	
	private int id;
	private String gameName;
	private String gameDetail;
	private double gamePrice;
	Campaign campaign;
	public  Game() {
		
	}

	public Game(int id, String gameName, String gameDetail, double gamePrice) {
		this.id = id;
		this.gameName = gameName;
		this.gameDetail = gameDetail;
		this.gamePrice = gamePrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getGameDetail() {
		return gameDetail;
	}

	public void setGameDetail(String gameDetail) {
		this.gameDetail = gameDetail;
	}

	public double getGamePrice() {
		return gamePrice;
	}

	public void setGamePrice(double gamePrice) {
		this.gamePrice = gamePrice;
	}
	
	public double getDiscountPrice() {
		
		return gamePrice - (gamePrice * campaign.getDiscount()/100);
	}
}
