package odevCamp4;

public class GamerCustomer implements GamerCustomerService{
	@Override
	public void signUp(Gamer gamer) {
		
		System.out.println("Sayýn "+gamer.getFirstName()+" "+gamer.getLastName()+" kaydýnýz baþarýyla oluþturulmuþtur.");
	}
	@Override
	public void update(Gamer gamer) {
		
		System.out.println("Sayýn "+gamer.getFirstName()+" "+gamer.getLastName()+" bilgileriniz baþarýyla güncellenmiþtir.");
	}
	@Override
	public void delete(Gamer gamer) {
		
		System.out.println("Sayýn "+gamer.getFirstName()+" "+gamer.getLastName()+" kaydýnýz  baþarýyla silinmþtir.");
	}

}
