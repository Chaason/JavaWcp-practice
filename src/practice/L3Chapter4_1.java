package practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class L3Chapter4_1 {
	public static void main(String[]args) {
	List<String> list1 = new ArrayList<String>();
	//ArrayListはインデックスを指定して作業するのに向いている（読み込みが高速）
	List<Integer> list2 = new LinkedList<Integer>();
	/*LinkedListはインデックスを指定せずに要素の追加（挿入）と削除をする作業に向いている
	インデックスを指定して追加削除をすると読み込み自体に時間がかかるので、その時はArrayListがGood*/
	
	//要素を追加するaddメソッド
	list1.add("りんご");
	list1.add("みかん");
	list1.add(1,"バナナ");
	System.out.println(list1);
	
	//要素を取得するgetメソッド
	String item = list1.get(0);
	System.out.println("item = " + item);
	
	//要素の存在をチェックするcontainsメソッド(戻り値はboolean)
	boolean a = list1.contains("バナナ"); //true
	boolean b = list1.contains("なし"); //false
	System.out.println("バナナは戻り値" + a + "、なしは戻り値" + b);
	
	//要素数を取得するsizeメソッド
	int n = list1.size();
	System.out.println("list1の要素数 =" + n);
	
	//要素を消すremoveメソッド(要素の中身か位置を指定できる)
	list1.remove("バナナ");  //「バナナ」を消す、戻り値はtrue
	System.out.println("バナナをremove結果 =" + list1);  
	list1.remove("なし");  //何もしない、戻り値はfalse
	System.out.println("なしをremoveした結果 =" + list1);
	
	list1.remove(0);  //戻り値は「りんご」
	System.out.println("インデックス「0」をremoveした結果 =" + list1);
	//list1.remove(5);  //コレクションの要素数より大きい位置を指定すると実行時エラー
	//System.out.println(list1);
	
	}
}
