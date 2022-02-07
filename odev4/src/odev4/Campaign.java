package odev4;

public class Campaign {
	
	String nameOfCampaign;
	String discountRateOfCampaign;
	String validityOfCampaign;
	
	public Campaign(String nameOfCampaign, String discountRateOfCampaign, String validityOfCampaign) {
		super();
		this.nameOfCampaign = nameOfCampaign;
		this.discountRateOfCampaign = discountRateOfCampaign;
		this.validityOfCampaign = validityOfCampaign;
	}

	public String getNameOfCampaign() {
		return nameOfCampaign;
	}

	public void setNameOfCampaign(String nameOfCampaign) {
		this.nameOfCampaign = nameOfCampaign;
	}

	public String getDiscountRateOfCampaign() {
		return discountRateOfCampaign;
	}

	public void setDiscountRateOfCampaign(String discountRateOfCampaign) {
		this.discountRateOfCampaign = discountRateOfCampaign;
	}

	public String getValidityOfCampaign() {
		return validityOfCampaign;
	}

	public void setValidityOfCampaign(String validityOfCampaign) {
		this.validityOfCampaign = validityOfCampaign;
	}
	

}
