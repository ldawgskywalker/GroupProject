
public class Combat {
	private static int r; 
	
	public Combat(){
		r=0;
	}
	
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
	public static void fight(Enemy e, int d){
		if(roll(20)>e.getArmour()){
			int dmg = roll(d);
			e.dmg(dmg);
			System.out.println("Enemy HIT! Deals "+dmg+" damage.You have "+e.getHp()+"HP left.");	
		}
		else{
			System.out.println("Enemy MISS!");
		}
		
	}
	public static int roll(int n){
		r = (int)(Math.random()*n+1);
		
		return r;
	}
	
}
