package odev4;

public class CampaignManager{

	
	public void addCampaign(Campaign campaign) {
		
		System.out.println(campaign.getNameOfCampaign() + " isimli kampanya %" + campaign.getDiscountRateOfCampaign() + " indirim oran�yla " +  campaign.getValidityOfCampaign() + " ay s�reli�ine sisteme eklendi.");
	}

	
	public void deleteCampaign(Campaign campaign) {
	
		System.out.println(campaign.getNameOfCampaign() + " isimli kampanya sistemden silindi.");
	}

	
	public void updateCampaign(Campaign campaign) {
		
		System.out.println(campaign.getNameOfCampaign() + " isimli kampanya bilgileri g�ncellendi.");
	}	

	

	
}
