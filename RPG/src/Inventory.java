import java.util.*;
public class Inventory {
	private ArrayList<Weapon> items;
	private int count;
	
	
	//CONSTRUCTOR
	public Inventory(){
		items = new ArrayList<Weapon>();
		count = 0;	
	}
	//SETTERS AND GETTERS
	public ArrayList<Weapon> getItems() {
		return items;
	}

	public void setItems(ArrayList<Weapon> items) {
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
