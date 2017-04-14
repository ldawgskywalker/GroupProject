
public class Combat {
	private static int r; 

	
	public static void fight(Player p, int d){
		if(roll(20)>p.getArmour()){
			int dmg = roll(d);
			p.dmg(dmg);
			System.out.println("Enemy HIT! Deals "+dmg+" damage.You have "+p.getHp()+"HP left.");	
		}
		else{
			System.out.println("Enemy MISS!");
		}
		
	}
	//FIGHT, TAKES IN ENEMY, AND HIGHEST POSSIBLE DMG
	public static void fight(Enemy e, int d){
		//ROLL TO SEE IF HITS ARMOUR
		if(roll(20)>e.getArmour()){
			//IF HITS, ROLLS FOR DMG
			int dmg = roll(d);
			e.dmg(dmg);
			System.out.println("You HIT! Deals "+dmg+" damage.Enemy has "+e.getHp()+"HP left.");	
		}
		//IF NO HIT, MISS
		else{
			System.out.println("You MISS!");
		}
		
	}
	//"DICE ROLLER"
	public static int roll(int n){
		r = (int)(Math.random()*n+1);
		
		return r;
	}
	
}
