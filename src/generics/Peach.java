package generics;

public class Peach extends Fruit {
	public Peach(String name, int price) {
		super(name, price);
	}
	
	@Override
	protected String getName() {
		return this.name;
	}
	
	@Override
	protected int getPrice() {
		return this.price;
	}
}
