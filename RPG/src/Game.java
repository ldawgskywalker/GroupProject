import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
public class Game {
	private static Player p;
	private static Enemy e;
	private static NPC n;
	private static World w;
	private static int count=0;
	public static void main(String[]args) throws IOException{
		Scanner kb=new Scanner(System.in);
		
		
		
		System.out.print("Input character's name: ");
			p = new Player(kb.nextLine());
		
		String s="";
		
		w	= new World();
		
		System.out.println("Welcome to the game, "+p.getName()+"!");
		
		for(int i=0;i<w.getRooms().size();i++){
			System.out.println("\n"+w.getRooms().get(i).getNorth()+
								"\n"+w.getRooms().get(i).getSouth()+
								"\n"+w.getRooms().get(i).getEast()+
								"\n"+w.getRooms().get(i).getWest()+
								"\n"+w.getRooms().get(i).getName()+
								"\n"+w.getRooms().get(i).getNPC().getName()+
								"\n"+w.getRooms().get(i).getEnemy().getName());
		}
		
		
		//COMBAT
		//int counter = 1;
		
		/*while(e.isAlive()!=false && p.isAlive()!=false){
			if(counter%2==0){
				System.out.println("Enemy Turn. Press enter to continue.");
					kb.nextLine();
				Combat.fight(p, e.getPack().getItems().getFirst().getDmg());	
			}
			if(counter%2!=0){
				System.out.println("Your turn. Press enter to roll");
					kb.nextLine();
				Combat.fight(e, p.getPack().getItems().getFirst().getDmg());
			}
			counter++;
		}*/
		
		
		//CLOSE
		kb.close();
	}
	public static void event(String s) throws FileNotFoundException{
		/*if(s.equals("look around")){
			if(count==0){
				System.out.print(w.getLook1());
				count++;
			}
			else 
				System.out.print(w.getLook2());		
			}
		if(s.equals("south")){
			if(w.getSouth().equals("DNE")){
				System.out.println("Unfortunately, you cannot go South.");
			}
			else{
				w.goSouth();
				count=0;
				if(!w.getN().equals(null))
					n=w.getN();
				if(!w.getE().equals(null))
					e=w.getE();
				
			}
		}
		if(s.equals("north")){
			if(w.getNorth().equals("DNE")){
				System.out.println("Unfortunately, you cannot go North.");
			}
			else{
				w.goNorth();
				count=0;
				if(!w.getN().equals(null))
					n=w.getN();
				if(!w.getE().equals(null))
					e=w.getE();
			}
			
		}
		if(s.equals("east")){
			if(w.getEast().equals("DNE")){
				System.out.println("Unfortunately, you cannot go East.");
			}
			else{
				w.goEast();
				count=0;
				if(!w.getN().equals(null))
					n=w.getN();
				if(!w.getE().equals(null))
					e=w.getE();
			}
			
		}
		if(s.equals("west")){
			if(w.getWest().equals("DNE")){
				System.out.println("Unfortunately, you cannot go West.");
			}
			else{
				w.goWest();
				count=0;
				if(!w.getN().equals(null))
					n=w.getN();
				if(!w.getE().equals(null))
					e=w.getE();
			}
			
		}*/
	}
}
