package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class L3Chapter4_4 {

	public static void main(String[] args) {
		//どのコレクションも拡張for文を使うことで順番に要素を取り出して処理を行える
		List<String> prefectures = new ArrayList<>();
		prefectures.add("北海道");
		prefectures.add("青森県");
		prefectures.add("秋田県");
		//例えばprefecturesに格納されている要素を順番に表示するなら
		System.out.println("=== 拡張for文で要素を表示 ===");
		for(String prefecture : prefectures) {
			System.out.println(prefecture);
		}
		
		//Mapの場合、キーのみ・値のみ・キーと値のペアのいずれかをループ対象に出来る
		Map<Integer, String> classmates = new HashMap<>();
		classmates.put(1, "青木");
		classmates.put(2, "石坂");
		classmates.put(3, "小野田");
		//キーのみ
		System.out.println("=== キーのみ表示 ===");
		for(Integer key : classmates.keySet()) {
			System.out.println(key); //HashMapなので順序は不定
		}
		//値のみ
		System.out.println("=== 値のみ表示 ===");
		for(String name : classmates.values()) {
			System.out.println(name); //HashMapなので順序は不定
		}
		//キーと値のペアの場合、Map.Entryというインターフェースを使う
		System.out.println("=== キーと値を指定して処理 ===");
		for(Map.Entry<Integer, String> classmate : classmates.entrySet()) {
			System.out.println(classmate.getKey() + "番は" + classmate.getValue() + "さんです");
		}
		

	}

}
