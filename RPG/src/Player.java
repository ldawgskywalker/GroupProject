public class Player {
	private int hp;
	private String name;
	private Inventory pack;

	
	public Player(String n){
		name = n;
		pack = new Inventory();
	}
	
}
