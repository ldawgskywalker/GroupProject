//Luke
public class NPC {
	private int hp;
	private int armour;
	private String name, says;
	private Inventory pack;
	private boolean alive;
	
	//CONSTRUCTOR
	public NPC(String n){
		name = n;
		pack = new Inventory();
		hp = 30;
		alive = true;
		armour = 13;
	}
	//SETTERS AND GETTERS
	public int getHp() {
		return hp;
	}

	public int getArmour() {
		return armour;
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
	public String getSays() {
		return says;
	}
	public void setSays(String s){
		this.says=s;
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
