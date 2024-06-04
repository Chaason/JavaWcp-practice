
public class Chapter08_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//曜日を表すString型の変数を定義し、 英単語で初期化する
		String day  = "Tuesday";
		//英単語に該当する日本語で曜日を出力する
		switch(day) {
		case "Sunday" :
			System.out.println("日曜日");
			break;
		case "Monday" :
			System.out.println("月曜日");
			break;
		case "Tuesday" :
			System.out.println("火曜日");
			break;
		case "Wednesday" :
			System.out.println("水曜日");
			break;
		case "Thursday" :
			System.out.println("木曜日");
			break;
		case "Friday" :
			System.out.println("金曜日");
			break;
		case "Saturday" :
			System.out.println("土曜日");
			break;
		//曜日以外の単語の場合は "曜日ではありません" を出力する
		default :
			System.out.println("曜日ではありません");
		}
	}
}
