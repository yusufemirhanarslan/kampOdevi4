package odevCamp4;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Yeni kampanya eklendi");
		System.out.println("Kampanya ismi:"+" "+campaign.getCampaignName()+" "+"kampanya baþlangýç tarihi:"+" "+campaign.getStartDate()+" "
				+"kampanya bitiþ tarihi:"+" "+campaign.getDeadLine()+" "+"kapmanya indirim oraný: "+" "+campaign.getDiscount());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya bilgileri güncellendi!!!!");
		System.out.println("Kampanya ismi:"+" "+campaign.getCampaignName()+" "+"kampanya baþlangýç tarihi:"+" "+campaign.getStartDate()+" "
		+"kampanya bitiþ tarihi:"+" "+campaign.getDeadLine()+" "+"kapmanya indirim oraný: "+" "+campaign.getDiscount());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi!!!");
		System.out.println("Silinen kampanyanýn bilgileri: ");
		System.out.println("Kampanya ismi:"+" "+campaign.getCampaignName()+"kampanya baþlangýç tarihi:"+" "+campaign.getStartDate()
		+"kampanya bitiþ tarihi:"+" "+campaign.getDeadLine()+" "+"kapmanya indirim oraný: "+" "+campaign.getDiscount());
		
	}

}
