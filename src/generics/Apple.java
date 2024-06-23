package generics;

public class Apple extends Fruit {
	public Apple(String name, int price) {
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
