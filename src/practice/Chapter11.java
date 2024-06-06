package practice;

public class Chapter11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//メンバー変数
		//日付
		int date = 20211010; //インスタンス変数
		//タスク内容
		String content ="「牛乳を買う」"; //インスタンス変数
		
		Task task = new Task(date, content);
		//20211010のタスク「牛乳を買う」は未完了です。と出力
		task.print();
		//タスク「牛乳を買う」を完了します。と出力
		task.done();
		//20211010のタスク「牛乳を買う」は完了しています。と出力
		task.print();
	}

}
