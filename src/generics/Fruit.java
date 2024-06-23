package generics;

abstract public class Fruit {
	String name;
	int price;
	
	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	abstract protected String getName();
	
	abstract protected int getPrice();
	
}
