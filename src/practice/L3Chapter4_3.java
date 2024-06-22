package practice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class L3Chapter4_3 {

	public static void main(String[] args) {
		//Setは重複のない要素を管理するコレクションで位置やキーなどの要素を特定する概念がない、あくまで集合
		Set<String> set1 = new HashSet<String>();
		Set<Integer> set2 = new LinkedHashSet<Integer>();
		
		//要素を追加するaddメソッド
		System.out.println("=== addメソッド ===");
		set1.add("スイカ");
		set1.add("メロン");
		System.out.println("set1に追加したもの = " + set1);
		
		//要素を取得する場合は拡張for文で要素を取り出す
		
		//要素の存在をチェックするcontainsメソッド(戻り値はboolean)
		System.out.println("=== containsメソッド ===");
		set1.contains("スイカ");
		set1.contains("なし");
		System.out.println("要素が「スイカ」の存在 = " + set1.contains("スイカ"));
		System.out.println("要素が「なし」の存在 = " + set1.contains("なし"));
		
		//要素数を取得するsizeメソッド
		System.out.println("=== sizeメソッド ===");
		set1.size();
		System.out.println("set1の要素数 = " + set1.size());
		
		//要素を削除するremoveメソッド
		System.out.println("=== removeメソッド ===");
		//set1.remove("スイカ");  //戻り値はtrue
		//set1.remove("なし");  //戻り値はfalse
		System.out.println("要素「スイカ」を削除 = " + set1.remove("スイカ"));
		System.out.println("要素「なし」を削除 = " + set1.remove("なし"));
	}

}
