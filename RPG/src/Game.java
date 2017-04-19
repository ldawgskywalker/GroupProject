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
		
		while(!s.equals("exit")){
			System.out.println(w.getDes());
			System.out.println("What would you like to do?");
				s = kb.nextLine().toLowerCase();
			event(s);
				
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
		if(s.equals("look around")){
			if(count==0){
				w.getLook1();
				count++;
			}
			if(count==1)
				w.getLook2();
		}
		if(s.equals("south")){
			if(w.getSouth().equals("DNE")){
				System.out.println("Unfortunately, you cannot go South.");
			}
			else{
				w.goSouth();
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
				if(!w.getN().equals(null))
					n=w.getN();
				if(!w.getE().equals(null))
					e=w.getE();
			}
			
		}
		if(s.equals("west")){
			if(w.getEast().equals("DNE")){
				System.out.println("Unfortunately, you cannot go West.");
			}
			else{
				w.goWest();
				if(!w.getN().equals(null))
					n=w.getN();
				if(!w.getE().equals(null))
					e=w.getE();
			}
			
		}
	}
}
