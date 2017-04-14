import java.util.*;
public class Inventory {
	private LinkedList<Weapon> items;
	private int count;
	
	
	//CONSTRUCTOR
	public Inventory(){
		items = new LinkedList<Weapon>();
		count = 0;	
	}
	//SETTERS AND GETTERS
	public LinkedList<Weapon> getItems() {
		return items;
	}

	public void setItems(LinkedList<Weapon> items) {
		this.items = items;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	//END OF SETTERS AND GETTERS
	
	//ADD WEAPONS TO ITEMS
	public void addItem(Weapon w){
		items.add(w);
		count++;
	}

	
	
	
	
	
	
}
