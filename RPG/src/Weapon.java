public class Weapon {
	private String name;
	private int dmg;
	private boolean obtainable;
	
	//CONSTRUCTOR
	public Weapon(String n, int d){
		name=n;
		dmg=d;
		obtainable=true;
	}
	//ALTERNATE CONSTRUCTOR
	public Weapon(String n, int d,boolean b){
		name=n;
		dmg=d;
		obtainable=b;
	}
	//SETTERS AND GETTERS
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDmg() {
		return dmg;
	}
	public void setDmg(int dmg) {
		this.dmg = dmg;
	}
	public boolean isObtainable() {
		return obtainable;
	}
	public void setObtainable(boolean obtainable) {
		this.obtainable = obtainable;
	}
	
	
	
}
