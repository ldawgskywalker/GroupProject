import java.util.Scanner;
import java.io.*;
public class World {
	private String north, south, east, west, curr;
	private String des, look1, look2;
	private int count;
	private Enemy e;
	private NPC n;
	
	//CONSTRUCTOR
	public World()throws IOException{
		Scanner in = new Scanner(new FileReader("maps.txt"));
		 
		while(!in.nextLine().equals("mp_woods")){
			in.nextLine();
		}
		north=in.nextLine();
		south=in.nextLine();
		east=in.nextLine();
		west=in.nextLine();
		if(!in.nextLine().equals("$")){
			if(in.nextLine().equals("npc"))
				n = new NPC(in.nextLine());
			else
				e = new Enemy(in.nextInt());
		}
		else{
			n = null;
			e=null;
		}
		des=in.nextLine();
		look1=in.nextLine();
		look2=in.nextLine();
		
		
		
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
		Scanner in = new Scanner(new FileReader("maps.txt"));
		 
		while(!in.nextLine().equals("mp_"+north)){
			in.nextLine();
		}
		north=in.nextLine();
		south=in.nextLine();
		east=in.nextLine();
		west=in.nextLine();
		if(!in.nextLine().equals("$")){
			if(in.nextLine().equals("npc"))
				n = new NPC(in.nextLine());
			else
				e = new Enemy(in.nextInt());
		}
		else{
			n = null;
			e=null;
		}
		des=in.nextLine();
		look1=in.nextLine();
		look2=in.nextLine();
		
		System.out.println(north+"\n"+south+"\n"+east+"\n"+west+"\n"+des+"\n"+look1+"\n"+look2);
		
		in.close();
	}
	
	public void goSouth() throws FileNotFoundException{
		Scanner in = new Scanner(new FileReader("maps.txt"));
		 
		while(!in.nextLine().equals("mp_"+south)){
			in.nextLine();
		}
		north=in.nextLine();
		south=in.nextLine();
		east=in.nextLine();
		west=in.nextLine();
		if(!in.nextLine().equals("$")){
			if(in.nextLine().equals("npc"))
				n = new NPC(in.nextLine());
			else
				e = new Enemy(in.nextInt());
		}
		else{
			n = null;
			e=null;
		}
		des=in.nextLine();
		look1=in.nextLine();
		look2=in.nextLine();
		
		System.out.println(north+"\n"+south+"\n"+east+"\n"+west+"\n"+des+"\n"+look1+"\n"+look2);
		
		in.close();
	}
	
	public void goEast() throws FileNotFoundException{
		Scanner in = new Scanner(new FileReader("maps.txt"));
		 
		while(!in.nextLine().equals("mp_"+east)){
			in.nextLine();
		}
		north=in.nextLine();
		south=in.nextLine();
		east=in.nextLine();
		west=in.nextLine();
		if(!in.nextLine().equals("$")){
			if(in.nextLine().equals("npc"))
				n = new NPC(in.nextLine());
			else
				e = new Enemy(in.nextInt());
		}
		else{
			n = null;
			e=null;
		}
		des=in.nextLine();
		look1=in.nextLine();
		look2=in.nextLine();
		
		System.out.println(north+"\n"+south+"\n"+east+"\n"+west+"\n"+des+"\n"+look1+"\n"+look2);
		
		in.close();
	}
	
	public void goWest() throws FileNotFoundException{
		Scanner in = new Scanner(new FileReader("maps.txt"));
		 
		while(!in.nextLine().equals("mp_"+west)){
			in.nextLine();
		}
		north=in.nextLine();
		south=in.nextLine();
		east=in.nextLine();
		west=in.nextLine();
		if(!in.nextLine().equals("$")){
			if(in.nextLine().equals("npc"))
				n = new NPC(in.nextLine());
			else
				e = new Enemy(in.nextInt());
		}
		des=in.nextLine();
		look1=in.nextLine();
		look2=in.nextLine();
		
		System.out.println(north+"\n"+south+"\n"+east+"\n"+west+"\n"+des+"\n"+look1+"\n"+look2);
		
		in.close();
	}
}
