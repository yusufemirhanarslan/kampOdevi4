package odevCamp4;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		
		System.out.println("Eklenen oyunun ad� :"+" "+game.getGameName()+" "+"fiyat�"+" "+game.getGamePrice()+"tl"+" "+"�zellikleri:"+" "+game.getGameDetail());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Silinen oyunun ad�: "+" "+game.getGameName());
		
	}

}
