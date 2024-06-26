package stream_api;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Fruit> fruits = new ArrayList<>();
		fruits.add(new Fruit("りんご", 7));
		fruits.add(new Fruit("みかん", 15));
		fruits.add(new Fruit("いちご", 4));
		fruits.add(new Fruit("メロン", 8));
		fruits.add(new Fruit("ぶどう", 20));
		
		//Stream API　と　ラムダ式なしで書くと・・・
		List<Fruit> filtered = new ArrayList<>(); //10個以下に絞り込まれたリストを作る
		//拡張for文でfruitsをループ
		for(Fruit fruit : fruits) {
			//if文で10個以下に絞り込んでfilteredリストに追加
			if(fruit.getQuantity() <= 10) {
				filtered.add(fruit);
			}
		}
		//20個ずつ追加する
		List<Fruit> ordered = new ArrayList<>();
		for(Fruit fruit : filtered) {
			ordered.add(fruit.order(20));
		}
		//個数が少ない順に並べ替える
		ordered.sort(new Comparator<Fruit>(){
			@Override
			public int compare(Fruit f1, Fruit f2) {
				return f1.getQuantity() - f2.getQuantity();
			}
		});
		
		//絞り込んで並べ替えたリストを拡張for文でループしながら出力
		for(Fruit fruit : ordered) {
			System.out.println(fruit);
		}
	}

}
