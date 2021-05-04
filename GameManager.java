package odevCamp4;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		
		System.out.println("Eklenen oyunun adý :"+" "+game.getGameName()+" "+"fiyatý"+" "+game.getGamePrice()+"tl"+" "+"özellikleri:"+" "+game.getGameDetail());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Silinen oyunun adý: "+" "+game.getGameName());
		
	}

}
