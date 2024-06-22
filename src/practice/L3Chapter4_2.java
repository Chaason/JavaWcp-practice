package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class L3Chapter4_2 {

	public static void main(String[] args) {
		Map<Integer, String> map1 = new HashMap<Integer, String>(); //キーがInteger、値がString
		//HashMapはバラバラ
		Map<String, String> map2 = new TreeMap<String, String>(); //キーも値もString
		//TreeMapは昇順
		
		//要素を追加するputメソッド
		System.out.println("=== putメソッド ===");
		map1.put(0, "ぶどう");
		map1.put(3, "もも");
		System.out.println("map1の要素 = " + map1);
		//登録済みのキーで追加すると上書きされる
		map1.put(0, "マスカット");
		System.out.println("map1のキー「0」に上書き = " + map1);

		//要素（値）を取得するgetメソッド
		System.out.println("=== getメソッド ===");
		map1.get(0); //キーが0の値「マスカット」を返す
		map1.get(1); //存在しないキーなのでnullを返す
		System.out.println("map1のキー0の値 = " + map1.get(0));
		System.out.println("map1のキー1の値 = " + map1.get(1));

		//要素の存在をチェックするcontainsKeyメソッドとcontainsValueメソッド
		//containsKeyメソッド・・・キーの存在をチェックする（戻り値はboolean）
		System.out.println("=== containsKey / containsValue　メソッド ===");
		map1.containsKey(0); //true
		//containsValueメソッド・・・値の存在をチェックする（戻り値はboolean）
		map1.containsValue("ぶどう"); //false
		System.out.println("キーが0の存在 = " + map1.containsKey(0));
		System.out.println("値が「ぶどう」の存在  = " + map1.containsValue("ぶどう"));

		//要素数を取得するsizeメソッド
		System.out.println("=== sizeメソッド ===");
		map1.size();
		System.out.println("map1の要素数 = " + map1.size());

		//要素の削除をするremoveメソッド
		/*キーのみ指定orキーと値を指定
		  キーのみ指定した場合は戻り値に値が返される。「●●という値の要素が削除されましたよー」的なかんじ。
		   →存在しないキーを指定すると何もせず、戻り値はnullになる
		  キーと値の両方を指定した場合は両方に一致する要素が削除される。この場合の戻り値はboolean
		   →存在しない要素を指定すると何もせず、戻り値はfalseになる（boolean）　*/
		//キーを指定して削除
		System.out.println("=== removeメソッド ===");
		//map1.remove(0); //戻り値は"マスカット"
		//map1.remove(1); //戻り値はnull
		System.out.println("map1のキー0を削除 = " + map1.remove(0));
		System.out.println("map1のキー1を削除 = " + map1.remove(1));
		//キーと値を指定して削除
		//map1.remove(3, "もも"); //戻り値はtrue
		//map1.remove(3, "なし"); //戻り値はfalse
		System.out.println("map1のキー3を値「もも」を削除 = " + map1.remove(3, "もも"));
		System.out.println("map1のキー3を値「なし」を削除 = " + map1.remove(1, "なし"));
	}

}
