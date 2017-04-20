import java.util.Scanner;
public class Store 
{
	//variables
	private Player p1;
	private int coins;
	Scanner kb = new Scanner(System.in);
	
	public Store(Player p1)
	{
		this.p1=p1;
		coins=p1.getGold();
	}
	public void activateStore()
	{
		//Shop text
				System.out.println("Welcome to the item shop!\nWhich item do you want?");
				System.out.println("1:Durable armour $50 \n2:Super Mega Laser sword $500\n3: Rainbow Potion $100");
				int choice=kb.nextInt();
				
				//if statements that check what item you want
				if(choice==1&&coins>=50)
				{
					System.out.println("You purchased the Durable armour!");
					p1.setArmour(17);
					System.out.println("Thank you! Come again!");
					
				}
				else if(choice==2&&coins>=500)
				{
					System.out.println("You purchased the Super mega laser sword!");
					System.out.println("As you leave the store, you trip and drop the sword killing you instantly."  );
					p1.setAlive(false);
				}
				else if(choice==3&&coins>=100)
				{
					System.out.println("You purchased the Rainbow potion");
					p1.setHp(30);
					System.out.println("Thank you! Come again!");
				}
				else
					System.out.println("Please come again!");
	}
}

