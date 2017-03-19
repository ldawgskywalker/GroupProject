public class Player {
	private int hp;
	private String name;
	private Inventory pack;

	//CONSTRUCTOR
	public Player(String n){
		name = n;
		pack = new Inventory();
		hp = 100;
	}
	//SETTERS AND GETTERS
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Inventory getPack() {
		return pack;
	}

	public void setPack(Inventory pack) {
		this.pack = pack;
	}
	//END OF SETTERS AND GETTERS

	public void addWeapon(Weapon w){
		pack.addItem(w);
	}
	public void addTool(Tool t){
		pack.addItem(t);
	}
	
}
