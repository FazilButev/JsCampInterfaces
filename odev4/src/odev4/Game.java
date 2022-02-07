package odev4;

public class Game {
	
	private String gameName;
	private int priceOfGame;
	private String typeOfGame;
	private String yearOfGame;
	
	
	public Game(String gameName, int priceOfGame, String typeOfGame, String yearOfGame) {
		
		this.gameName = gameName;
		this.priceOfGame = priceOfGame;
		this.typeOfGame = typeOfGame;
		this.yearOfGame = yearOfGame;
	}
	
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public int getPriceOfGame() {
		return priceOfGame;
	}
	public void setPriceOfGame(int priceOfGame) {
		this.priceOfGame = priceOfGame;
	}
	public String getTypeOfGame() {
		return typeOfGame;
	}
	public void setTypeOfGame(String typeOfGame) {
		this.typeOfGame = typeOfGame;
	}
	public String getYearOfGame() {
		return yearOfGame;
	}
	public void setYearOfGame(String yearOfGame) {
		this.yearOfGame = yearOfGame;
	}
	

}
