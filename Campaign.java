package odevCamp4;

public class Campaign {
	
	private String campaignName;
	private String startDate;
	private String deadLine;
	private int discount;
	
	public Campaign() {
		
	}

	public Campaign(String campaignName, String startDate, String deadLine, int discount) {
		this.campaignName = campaignName;
		this.startDate = startDate;
		this.deadLine = deadLine;
		this.discount = discount;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getDeadLine() {
		return deadLine;
	}

	public void setDeadLine(String deadLine) {
		this.deadLine = deadLine;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
}
