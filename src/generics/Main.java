package generics;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Basket<Apple> appleBasket = new Basket<>(new Apple("ふじ", 200));
		Basket<Peach> peachBasket = new Basket<>(new Peach("黄金桃", 300));
		
		appleBasket.printTotalPrice();
		peachBasket.printTotalPrice();
		
		
		Set<Integer> set = new LinkedHashSet<>();
		set.add(1);
		//set.add("Two");
		
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Taro");
		map.put(2, "Hanako");
		//int value = map.get(0);
	}

}
