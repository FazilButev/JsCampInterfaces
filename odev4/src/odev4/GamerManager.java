package odev4;

public class GamerManager{

	
	public void addGamer(Gamer gamer) {
		
		System.out.println(gamer.getFirstName() + " isimli oyuncu sisteme eklendi.");
	}

	
	public void deleteGamer(Gamer gamer) {
	
		System.out.println(gamer.getFirstName() + " isimli oyuncu sistemden silindi.");
	}

	
	public void updateGamer(Gamer gamer) {
		
		System.out.println(gamer.getFirstName() + " isimli oyuncu sistemdeki bilgilerini güncelledi.");
	}

	

	
}
