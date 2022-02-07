package odev4;

public interface Manager {
	public void add(Gamer gamer,Campaign campaign);
	public void delete(Gamer gamer,Campaign campaign);
	public void update(Gamer gamer,Campaign campaign);
	public void sell(Gamer gamer,Game game);
}
