package generics;

public class Main {

	public static void main(String[] args) {
		Basket<Apple> appleBasket = new Basket<>(new Apple("ふじ", 200));
		Basket<Peach> peachBasket = new Basket<>(new Peach("黄金桃", 300));
		
		appleBasket.printTotalPrice();
		peachBasket.printTotalPrice();
	}

}
