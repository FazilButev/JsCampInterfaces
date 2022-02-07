package odev4;

public class Main {

	public static void main(String[] args) {
		
		Game game1 = new Game("Knight Online",20,"Multiple","2003");
		Game game2 = new Game("Counter-Strike",12,"MMPOG","1997");
		Game game3 = new Game("Silkroad",15,"Multiple","2008");
		Game game4 = new Game("Sims",10,"Single","1990");
		
		
		Gamer gamer1 = new Gamer(123,"Faz�l","B�tev","05-06-1994","Erkek","27");
		Gamer gamer2 = new Gamer(1234,"P�nar","B�tev","23-03-1994","Kad�n","27");
		Gamer gamer3 = new Gamer(12345,"Merve","B�tev","27-11-1998","Kad�n","23");
		Gamer gamer4 = new Gamer(123456,"�smail","B�tev","01-01-1964","Erkek","57");
		Gamer gamer5 = new Gamer(1234567,"Sultan","B�tev","01-01-1963","Kad�n","58");
		
		Campaign campaign1 = new Campaign("Harika �ubat Kampanyas�","25","4");
		Campaign campaign2 = new Campaign("S�per Temmuz Kampanyas�","15","2");
		Campaign campaign3 = new Campaign("Y�lba�� Kampanyas�","50","1");
				
		GameManager gameManager = new GameManager();
		gameManager.sellGame(gamer5, game4, campaign3);
		gameManager.sellGame(gamer2, game1, campaign2);
		gameManager.sellGame(gamer1, game3, campaign1);
		
		GamerManager gamerManager = new GamerManager();
		gamerManager.addGamer(gamer1);
		gamerManager.addGamer(gamer3);
		gamerManager.deleteGamer(gamer1);
		gamerManager.updateGamer(gamer4);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.addCampaign(campaign3);
		campaignManager.addCampaign(campaign2);
		campaignManager.deleteCampaign(campaign1);
		campaignManager.updateCampaign(campaign3);
		
	}

}
