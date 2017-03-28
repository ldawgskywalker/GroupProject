public class Karma {
	private static int counter;
	
	//CONSTRUCTOR
	public Karma(){
		counter=0;
	}
	
	public static void CounterUp(){
		counter++;
	}
	public static void CounterDown(){
		if(counter>0){
			counter--;
		}
	}
	public static int getCounter(){
		return counter;
	}
}
