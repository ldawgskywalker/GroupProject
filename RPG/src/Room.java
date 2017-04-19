
public class Room {
	private String north, south, east, west, curr;
	private String name, des, look1, look2;
	private int count;
	private Enemy enemy;
	private NPC npc;
	
	//CONSTRUCTOR
	public Room(String na, String n, String s, String e, String w, String d, String l1, String l2, Enemy en, NPC np){
		name=na;
		north=n;
		south=s;
		east=e;
		west=w;
		des=d;
		look1=l1;
		look2=l2;
		enemy=en;
		npc=np;
	}
	//GETTERS AND SETTERS
	
	public String getNorth() {
		return north;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public NPC getNpc() {
		return npc;
	}

	public void setNpc(NPC npc) {
		this.npc = npc;
	}

	public void setEnemy(Enemy enemy) {
		this.enemy = enemy;
	}

	public void setNorth(String north) {
		this.north = north;
	}

	public String getSouth() {
		return south;
	}

	public void setSouth(String south) {
		this.south = south;
	}

	public String getEast() {
		return east;
	}

	public void setEast(String east) {
		this.east = east;
	}

	public String getWest() {
		return west;
	}

	public void setWest(String west) {
		this.west = west;
	}

	public String getCurr() {
		return curr;
	}

	public void setCurr(String curr) {
		this.curr = curr;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public String getLook1() {
		return look1;
	}

	public void setLook1(String look1) {
		this.look1 = look1;
	}

	public String getLook2() {
		return look2;
	}

	public void setLook2(String look2) {
		this.look2 = look2;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Enemy getEnemy() {
		return enemy;
	}

	public void setE(Enemy e) {
		this.enemy = e;
	}

	public NPC getNPC() {
		return npc;
	}

	public void setNPC(NPC n) {
		this.npc = n;
	}
	//END OF GETTERS AND SETTERS//
}
