import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.TimeUnit;
public class Game {
	private static Player p;
	private static World w;
	private static int count=0;
	public static void main(String[]args) throws IOException, InterruptedException{
		Scanner kb=new Scanner(System.in);
		
		
		
		System.out.print("Input character's name: ");
			p = new Player(kb.nextLine());
		
		String s="";
		
		w	= new World();
		
		System.out.println("Welcome to the game, "+p.getName()+"!");
		System.out.println();
		System.out.println("//RULES AND SUCH");
		System.out.print(w.getDes());
		while(!s.equals("exit")){
			
			System.out.println("What would you like to do?");
				s = kb.nextLine();
			event(s);
			if(w.getE()!=null){
				System.out.print("Battle ensues!");
				for(int i=1;i<p.getPack().getItems().size();i++){
					System.out.println(i+"."+p.getPack().getItems().get(i).getName()+"\t Deals "+p.getPack().getItems().get(i).getDmg()+" damage.");
				}
				event(w.getE(),kb.nextInt()-1);
				if(w.getE().getHp()<=0){
					System.out.println(w.getE().getName()+" is dead!");
					w.setE(null);
				}
			}
			
		}
		
		//CLOSE
		kb.close();
	}
	public static void event(String s) throws FileNotFoundException, InterruptedException{
		if(s.equals("look around")){
			if(count==0){
				System.out.print(w.getLook1());
				count++;
			}
			else 
				System.out.print(w.getLook2());		
			}
		else if(s.equals("south")){
			if(w.getSouth().equals("null")){
				System.out.println("Unfortunately, you cannot go South.");
			}
			else{
				w.goSouth();
				System.out.print(w.getDes());
				
			}
		}
		else if(s.equals("north")){
			if(w.getNorth().equals("null")){
				System.out.println("Unfortunately, you cannot go North.");
			}
			else{
				w.goNorth();
				System.out.print(w.getDes());
			}
			
		}
		else if(s.equals("east")){
			if(w.getEast().equals("null")){
				System.out.println("Unfortunately, you cannot go East.");
			}
			else{
				w.goEast();
				System.out.print(w.getDes());

			}
			
		}
		else if(s.equals("west")){
			if(w.getWest().equals("null")){
				System.out.println("Unfortunately, you cannot go West.");
			}
			else{
				w.goWest();
				System.out.print(w.getDes());
			}
			
		}
		else if(s.equals("talk")){
			if(w.getN()==null){
				System.out.println("There is a time and place for everything... But not now.");
			}
			else
				System.out.println(w.getN().getSays());
		}
		else if(s.equals("take")){
			if(w.getN()==null&&w.getE()==null){
				System.out.println("There's nothing to take...");
			}
			//takes first item in NPC inventory
			if(w.getN()!=null){
				System.out.println("You successfully added "+w.getN().getPack().getItems().get(0).getName()+" to your inventory");
				p.addWeapon(w.getN().getPack().getItems().remove(0));
				
			}
			if(w.getE()!=null){
				p.addWeapon(w.getE().getPack().getItems().remove(0));
			}
		}
		else if(s.equals("weapons")){
			for(int i=1;i<p.getPack().getItems().size();i++){
				System.out.println(i+"."+p.getPack().getItems().get(i).getName()+"\t Deals "+p.getPack().getItems().get(i).getDmg()+" damage.");
			}
		}
		else if(s.equals("hp")){
			System.out.println("HP: "+p.getHp());
		}
		else if(s.equals("sleep")){
			p.setHp(30);
			System.out.println("This looks like a good a place to rest...");
			TimeUnit.SECONDS.sleep(3);
			System.out.println("You wake up refreshed, and your HP is full again.");
		}
	}
	public static void event(Enemy e, int i){
		Scanner kb=new Scanner(System.in);
		//COMBAT
				int counter = 1;
				
				while(e.isAlive()!=false && p.isAlive()!=false){
					//enemy turn
					if(counter%2==0){
						System.out.println("Enemy Turn. Press enter to continue.");
							kb.nextLine();
						Combat.fight(p, e.getPack().getItems().get(0).getDmg());	
					}
					//player turn
					if(counter%2!=0){
						System.out.println("Your turn. Press enter to roll");
							kb.nextLine();
						Combat.fight(e, p.getPack().getItems().get(i).getDmg());
					}
					counter++;
				}
				
	}
}
