package odevCamp4;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Yeni kampanya eklendi");
		System.out.println("Kampanya ismi:"+" "+campaign.getCampaignName()+" "+"kampanya ba�lang�� tarihi:"+" "+campaign.getStartDate()+" "
				+"kampanya biti� tarihi:"+" "+campaign.getDeadLine()+" "+"kapmanya indirim oran�: "+" "+campaign.getDiscount());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya bilgileri g�ncellendi!!!!");
		System.out.println("Kampanya ismi:"+" "+campaign.getCampaignName()+" "+"kampanya ba�lang�� tarihi:"+" "+campaign.getStartDate()+" "
		+"kampanya biti� tarihi:"+" "+campaign.getDeadLine()+" "+"kapmanya indirim oran�: "+" "+campaign.getDiscount());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi!!!");
		System.out.println("Silinen kampanyan�n bilgileri: ");
		System.out.println("Kampanya ismi:"+" "+campaign.getCampaignName()+"kampanya ba�lang�� tarihi:"+" "+campaign.getStartDate()
		+"kampanya biti� tarihi:"+" "+campaign.getDeadLine()+" "+"kapmanya indirim oran�: "+" "+campaign.getDiscount());
		
	}

}
