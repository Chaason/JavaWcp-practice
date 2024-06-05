
public class Continue01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for(int count = 0; count < 5; count++) {
			if(count == 2) {
				continue; //countが２の場合、この後の処理をスキップする
			}
			System.out.println("Continue01 = " + count);
		}
	}

}
