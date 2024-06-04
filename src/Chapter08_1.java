
public class Chapter08_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//距離を表すint型の変数を定義し、任意の値で初期化する
		int distance = 7;
	
		//距離が5以下の場合は "とても近いです" を出力する
		if(distance <= 5) {
			System.out.println("とても近いです");
		}
		//距離が5より大きく10以下の場合は "近いです" を出力する
		else if(distance <= 10){
			System.out.println("近いです");
		}
		//距離が10より大きく15以下の場合は "遠いです" を出力する
		else if(distance <= 15) {
			System.out.println("遠いです");
		}
		//距離が15より大きい場合は "とても遠いです" を出力する
		else {
			System.out.println("とても遠いです");
		}
	}

}
