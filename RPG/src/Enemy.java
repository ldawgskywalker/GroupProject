
public class Enemy {
	private int hp;
	private int armour;
	private String name;
	private Inventory pack;
	private boolean alive;

	

	//CONSTRUCTOR
	public Enemy(int s){
		pack = new Inventory();
		alive = true;
		set(s);
	}
	//SETTERS AND GETTERS
	
	public int getHp() {
		return hp;
	}

	public int getArmour() {
		return armour;
	}

	public void setArmour(int armour) {
		this.armour = armour;
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
	public void addTool(Tool t){
		pack.addItem(t);
	}
	public void dmg(int d){
		hp = hp-d;
		if(hp<=0)
			alive = false;
	}

	public void set(int q){
		//GOBLINS
		if(q==1){
			name = "Goblin";
			hp=4;
			armour=10;
			pack.addItem(new Weapon("Rusty Short Sword",4));
			pack.addItem(2);
		}
		//BANDITS
		if(q==2){
			hp=10;
			armour=13;
			pack.addItem(new Weapon("Dagger",6));
			pack.addItem(7);
		}
		//TROLLS
		if(q==3){
			hp=7;
			armour = 11;
			pack.addItem(new Weapon("Club", 6));
		}
		//SKELETONS
		if(q==4){
			hp=5;
			armour = 9;
			pack.addItem(new Weapon("Sword",6));
		}
		//PHANTOM
		if(q==5){
			hp=12;
			armour=10;
			pack.addItem(new Weapon("Slash",7,false));
		}
		//DRAGON
		if(q==6){
			hp=20;
			armour=14;
			pack.addItem(new Weapon("Claw",4,false));
			pack.addItem(new Weapon("Fire",6,false));
		}
	}
	

}
