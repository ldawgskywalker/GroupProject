import java.util.*;
public class Inventory {
	private LinkedList items;
	private int count;
	
	public Inventory(){
		items = new LinkedList();
		count = 0;
	}
	//SETTERS AND GETTERS
	//TODO: SETTERS AND GETTERS
	//END OF SETTERS AND GETTERS
	
	public void addItem(Weapon w){
		items.add(w);
		count++;
	}
	
	public void addItem(){
		
	}
	
	
	
	
}
