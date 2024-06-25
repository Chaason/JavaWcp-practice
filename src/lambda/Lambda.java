package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lambda {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, -8, 4, 2);

		/*Collections.sort(
		  //Collections.sortは第1引数のリストを第2引数で定義している通りに並び替える
				numbers,  //第1引数
				new Comparator<Integer>() {  //第2引数に無名クラスを使ってソートルールを定義
					@Override
					public int compare(Integer x, Integer y) {
						return Integer.compare(x, y);
					}
				});
		System.out.println(numbers);
		*/
		
		//上記をラムダ式を使って書き換えると・・・
		Collections.sort(
				numbers,
				(Integer x, Integer y) -> { 
					//Comparatorインターフェースはcompare抽象メソッドが1つの関数型インターフェースなのでラムダ式で書ける
					return Integer.compare(x, y);
				});
		System.out.println(numbers);
		//ラムダ式はメソッドの引数として渡したり、変数に格納したりする必要がある。
		//ラムダ式単体で使ってもコンパイルエラーになる。
		
		
		Greeting greeting1 = () -> {  //ラムダ式を使ってhelloを実装
			return "こんにちは";
		};
	}
}
