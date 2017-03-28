import java.util.*;
public class Inventory {
	private LinkedList items;
	private int count;
	
	
	//CONSTRUCTOR
	public Inventory(){
		items = new LinkedList();
		count = 0;
		items.add(50);		
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
	
	//ADD WEAPONS TO ITEMS
	public void addItem(Weapon w){
		items.add(w);
		count++;
	}
	//ADD TOOL TO ITEMS
	public void addItem(Tool t){
		items.add(t);
		count++;
	}
	//ADD MONEY TO ITEMS
	public void addItem(int g){
		int temp;
		temp = g+(int)items.getFirst();
		//add to front
		items.offerFirst(temp);
		count++;
	}
	
	
	
	
	
	
}
