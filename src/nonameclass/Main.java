package nonameclass;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		A a = new A() {};
		System.out.println(a.hello());
		
		//無名クラスを使ってAのインスタンスで処理
		A b1 = new A() {
			@Override
			public String hello() {
				return "Hello B!";
			}
		};
		System.out.println(b1.hello());
		
		
		B b2 = new BImpl();
		System.out.println(b2.hello());
		
		//無名クラスを使ってインターフェースを実装
		B b3 = new B() {  
		/*インターフェースBをインスタンス化するようなイメージでOverrideさせるだけ。
		無名クラスを使うことでインターフェースを実装したクラスを用意する必要もなくなる。
		ただし無名クラスは局所的に使う場合のみ。クラスを常用する場合はクラスを作るべし。
		*/
			@Override
			public String hello() {
				return "Hello B!";
			}
		};
		System.out.println(b3.hello());
		
		
		// 並び替え対象のリスト
		List<Integer> numbers = Arrays.asList(1, -8, 4, 2);

		Collections.sort(  
		//Collections.sortは第1引数のリストを第2引数で定義している通りに並び替える
		    numbers,  //第1引数
		    new Comparator<Integer>() {  //第2引数に無名クラスを使ってソートルールを定義
		      @Override
		      public int compare(Integer x, Integer y) {
		        // 数値が小さい順に並べる
		        return Integer.compare(x, y);
		      }
		    });

		System.out.println(numbers);
		
	}

}
