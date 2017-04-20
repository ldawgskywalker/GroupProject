import java.util.Scanner;
import java.io.*;
public class World {
	private String north, south, east, west, curr;
	private String des, look1, look2;
	private int count;
	private Enemy e;
	private NPC n;
	private Scanner in;
	
	//CONSTRUCTOR
	public World()throws IOException{
		in = new Scanner(new FileReader("woods.txt"));
		
		north=in.nextLine();
		south=in.nextLine();
		east=in.nextLine();
		west=in.nextLine();
		des=in.nextLine();
		look1=in.nextLine();
		look2=in.nextLine();
		if(in.nextLine().equals("npc")){
			n = new NPC(in.nextLine());
			n.addWeapon(new Weapon(in.nextLine(),in.nextInt()));
			n.setSays(in.nextLine());
		}
		else if(in.nextLine().equals("enemy"))
			e = new Enemy(in.nextInt());
		in.close();
	}

	public String getNorth() {
		return north;
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

	public Enemy getE() {
		return e;
	}

	public void setE(Enemy e) {
		this.e = e;
	}

	public NPC getN() {
		return n;
	}

	public void setN(NPC n) {
		this.n = n;
	}
	
	public void goNorth() throws FileNotFoundException{
		in = new Scanner(new FileReader(north.toLowerCase()+".txt"));
		
		north=in.nextLine();
		south=in.nextLine();
		east=in.nextLine();
		west=in.nextLine();
		des=in.nextLine();
		look1=in.nextLine();
		look2=in.nextLine();
		if(in.nextLine().equals("npc")){
			n = new NPC(in.nextLine());
			n.addWeapon(new Weapon(in.nextLine(),in.nextInt()));
			n.setSays(in.nextLine());
		}
		else if(in.nextLine().equals("enemy"))
			e = new Enemy(in.nextInt());
		
		
		in.close();
	}
	
	public void goSouth() throws FileNotFoundException{
		in = new Scanner(new FileReader(south.toLowerCase()+".txt"));
		 
		north=in.nextLine();
		south=in.nextLine();
		east=in.nextLine();
		west=in.nextLine();
		des=in.nextLine();
		look1=in.nextLine();
		look2=in.nextLine();
		if(in.nextLine().equals("npc")){
			n = new NPC(in.nextLine());
			n.addWeapon(new Weapon(in.nextLine(),in.nextInt()));
			n.setSays(in.nextLine());
		}
		else if(in.nextLine().equals("enemy"))
			e = new Enemy(in.nextInt());
		
		
		in.close();
	}
	
	public void goEast() throws FileNotFoundException{
		in = new Scanner(new FileReader(east.toLowerCase()+".txt"));
		 
		north=in.nextLine();
		south=in.nextLine();
		east=in.nextLine();
		west=in.nextLine();
		des=in.nextLine();
		look1=in.nextLine();
		look2=in.nextLine();
		if(in.nextLine().equals("npc")){
			n = new NPC(in.nextLine());
			n.addWeapon(new Weapon(in.nextLine(),in.nextInt()));
			n.setSays(in.nextLine());
		}
		else if(in.nextLine().equals("enemy"))
			e = new Enemy(in.nextInt());
		
		in.close();
	}
	
	public void goWest() throws FileNotFoundException{
		in = new Scanner(new FileReader(west.toLowerCase()+".txt"));
		 
		north=in.nextLine();
		south=in.nextLine();
		east=in.nextLine();
		west=in.nextLine();
		des=in.nextLine();
		look1=in.nextLine();
		look2=in.nextLine();
		if(in.nextLine().equals("npc")){
			n = new NPC(in.nextLine());
			n.addWeapon(new Weapon(in.nextLine(),in.nextInt()));
			n.setSays(in.nextLine());
		}
		else if(in.nextLine().equals("enemy"))
			e = new Enemy(in.nextInt());

		
		in.close();
	}
}
