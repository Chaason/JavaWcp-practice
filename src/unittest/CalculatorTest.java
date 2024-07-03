package unittest;

/*テストクラスの書き方
 * テストクラスのルール
   1.テストメソッドを1つ以上含む
   2.テストクラスはabstractにしない
   3.テストクラスはprivateにしない
 * テストメソッドのルール
   1.テストメソッドであることを示すorg.junit.jupiter.api.Testアノテーションをつける
   2.テストメソッドはabstractにしない
   3.テストメソッドはprivateにしない
   4.テストメソッドは戻り値を持たない(voidにする) 
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

//クラスのアクセス修飾子はpublicでも可
//テストクラスの名前は自由だが、xxxTestやＴｅｓｔxxxという命名規則がある
class CalculatorTest {
	/*
	//テストメソッドの目印としてTestアノテーションをつける
	@Test
	//メソッドのアクセス修飾子もpublicでも可
	void test() {
		//org.junit.jupiter.api.Assertions.failメソッドは必ずテストを失敗させるメソッド
		//まだ自動で追加しただけなのでテストメソッドが未実装であることを示している
		fail("まだ実装されていません");
	}
	*/
	
	//テストメソッドを実装すると
	@Test
	// org.junit.jupiter.api.DiplayName　アノテーションで、テスト結果表示画面で使う文言を設定できる
	//DisplayNameアノテーションなしの場合は、テストメソッド名が表示される
	@DisplayName("2の二乗は4になる")
	void testSquare2() {
		
		//1.テスト対象クラスのセットアップとして、インスタンス化や実用に応じて初期値のセットなどを行う
		//Calculator calc = new Calculator();
		//2.テスト対象メソッド(今回はsquareメソッド)を実行し、結果を取得する
		int result = calc.square(2);
		//3.実行結果の実測値と期待値の検証（アサーション）を行う
		//ここでは実測値(result)と期待値(4)と一致するかどうかをassertEqualsメソッドで検証
		//assertEqualsメソッドはhamcrestというライブラリのもの
		assertEquals(result, 4);
	}
	
	
	@Test
	@DisplayName("4の平方根は2になる")
	void testRoot4() {
		//1.テスト対象クラスのセットアップ
		//Calculator calc = new Calculator();
		//2.テスト対象メソッドを実行して結果を取得する
		double result = calc.root(4.0);
		//3.実行結果の実測値と期待値の検証
		assertEquals(result, 2.0);
	}
	
	
	//例外を検証するテストの書き方
	@Test
	@DisplayName("-1の平方根は例外が発生する")
	void testRootException() {
		//1.テスト対象クラスのセットアップ
		//Calculator calc = new Calculator();
		//2.テスト対象メソッドの実行と　3.実行結果の検証を1行で行っている
		//org.junit.jupiiter.api.Assertions.assertThrowsメソッドを使っている
		assertThrows(IllegalArgumentException.class, () -> calc.root(-1));
		/* 第一引数では、テストの期待結果の例外クラスを指定する
		 * 今回は、引数に-1を渡したときのテストなので IllegalArgumentException.classが発生することを期待する
		 * 第二引数では、テスト対象メソッドの実行をラムダ式で指定する
		 */
	}
	
	//共通の処理をまとめる（Calculatorクラスのインスタンス化を共通化
	//1.テスト対象クラスをフィールドに追加
	private Calculator calc;
	//各テストメソッドの実行前に毎回呼ばれる処理を記載する
	@BeforeEach
	void setUp() {
		//フィールドにCaluclatorクラスのインスタンスを代入する
		calc = new Calculator();
	}
}
