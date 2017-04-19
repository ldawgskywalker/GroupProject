import java.util.*;
import java.io.*;
public class World {
	 private ArrayList<Room> rooms;
	 private String name, north, south, east, west, des, l1, l2, temp;
	 private Enemy e;
	 private NPC n;
	
	//CONSTRUCTOR
	public World()throws IOException{
		rooms = new ArrayList<Room>();
		
		BufferedReader in = new BufferedReader(new FileReader("maps.txt"));
		
		
		while(!in.readLine().equals(null)){
			name=in.readLine();
			north=in.readLine();
			south=in.readLine();
			east=in.readLine();
			west=in.readLine();
			des=in.readLine();
			l1=in.readLine();
			l2=in.readLine();
			temp=in.readLine();
			if(temp.equals("$")){
				e=null;
				n=null;
			}
			else if(temp.equals("enemy"))
				e = new Enemy(in.read());
			else 
				n = new NPC(in.readLine());
			rooms.add(new Room(name,north,south,east,west,des,l1,l2,e,n));
			
		}
		
	}

	public ArrayList<Room> getRooms() {
		return rooms;
	}

	public void setRooms(ArrayList<Room> rooms) {
		this.rooms = rooms;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public String getL1() {
		return l1;
	}

	public void setL1(String l1) {
		this.l1 = l1;
	}

	public String getL2() {
		return l2;
	}

	public void setL2(String l2) {
		this.l2 = l2;
	}

	public String getTemp() {
		return temp;
	}

	public void setTemp(String temp) {
		this.temp = temp;
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
	
	
	
	
	
}