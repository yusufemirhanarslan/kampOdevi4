package odevCamp4;

public class GamerCustomer implements GamerCustomerService{
	@Override
	public void signUp(Gamer gamer) {
		
		System.out.println("Say�n "+gamer.getFirstName()+" "+gamer.getLastName()+" kayd�n�z ba�ar�yla olu�turulmu�tur.");
	}
	@Override
	public void update(Gamer gamer) {
		
		System.out.println("Say�n "+gamer.getFirstName()+" "+gamer.getLastName()+" bilgileriniz ba�ar�yla g�ncellenmi�tir.");
	}
	@Override
	public void delete(Gamer gamer) {
		
		System.out.println("Say�n "+gamer.getFirstName()+" "+gamer.getLastName()+" kayd�n�z  ba�ar�yla silinm�tir.");
	}

}
