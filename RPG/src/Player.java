public class Player {
	private int hp;
	private int armour;
	private String name;
	private Inventory pack;
	private boolean alive;
	private int gold;
	
	//CONSTRUCTOR
	public Player(String n){
		name = n;
		pack = new Inventory();
		hp = 30;
		alive = true;
		armour = 13;
		gold=50;
	}
	//SETTERS AND GETTERS
	public int getHp() {
		return hp;
	}

	public int getArmour() {
		return armour;
	}

	public int getGold() {
		return gold;
	}
	public void setGold(int gold) {
		this.gold = gold;
	}
	public void setArmour(int armour) {
		this.armour += armour;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
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

	public void dmg(int d){
		hp = hp-d;
		if(hp<=0)
			alive = false;
	}
	
}
