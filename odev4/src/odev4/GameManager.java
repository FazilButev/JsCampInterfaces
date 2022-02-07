package odev4;

public class GameManager{



	public void sellGame(Gamer gamer , Game game , Campaign campaign) {
		
		System.out.println(game.getGameName() + " isimli oyunun satýþý " + gamer.getFirstName() + " isimli kullanýcýya " + campaign.getNameOfCampaign() + " isimli kampanya ile %" + campaign.getDiscountRateOfCampaign() + " indirim oranýyla satýþý yapýlmýþtýr.");
	}
	
}
