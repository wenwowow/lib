package command;

import java.util.HashMap;

public class Order {

	private int id;
	private HashMap<String,Integer> fruitmap;
	public Order() {
		fruitmap=new HashMap<String,Integer>();
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public HashMap<String, Integer> getFruitmap() {
		return fruitmap;
	}
	public void setFruitmap(String fruitKind,int quantity) {
		this.fruitmap.put(fruitKind, quantity);
	}

}
