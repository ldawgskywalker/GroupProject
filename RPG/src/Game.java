import java.util.*;
public class Game {
	public static void main(String[]args){
		Scanner kb=new Scanner(System.in);
		
		Enemy e = new Enemy(1);
		
		System.out.print("Input character's name: ");
			Player p = new Player(kb.nextLine());
		
		int counter = 1;
		
		while(e.isAlive()!=false && p.isAlive()!=false){
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
		}
		
		
		//CLOSE
		kb.close();
	}
}
