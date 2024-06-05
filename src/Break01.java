
public class Break01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for(int count = 0; count < 5; count++) {
			if(count == 2) {
				break;  //countが２の場合、for文を終了させる
			}
			System.out.println("Break01 = "+ count);
		}
	}

}
