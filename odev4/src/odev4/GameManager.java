package odev4;

public class GameManager{



	public void sellGame(Gamer gamer , Game game , Campaign campaign) {
		
		System.out.println(game.getGameName() + " isimli oyunun sat��� " + gamer.getFirstName() + " isimli kullan�c�ya " + campaign.getNameOfCampaign() + " isimli kampanya ile %" + campaign.getDiscountRateOfCampaign() + " indirim oran�yla sat��� yap�lm��t�r.");
	}
	
}
