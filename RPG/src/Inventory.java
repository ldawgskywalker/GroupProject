import java.util.*;
public class Inventory {
	private LinkedList items;
	private int count;
	
	//CONSTRUCTOR
	public Inventory(){
		items = new LinkedList();
		count = 0;
	}
	//SETTERS AND GETTERS
	public LinkedList getItems() {
		return items;
	}

	public void setItems(LinkedList items) {
		this.items = items;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	//END OF SETTERS AND GETTERS
	
	public void addItem(Weapon w){
		items.add(w);
		count++;
	}
	


	public void addItem(Tool t){
		items.add(t);
		count++;
	}
	
	
	
	
}
