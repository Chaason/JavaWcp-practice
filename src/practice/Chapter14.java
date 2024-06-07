package practice;

public class Chapter14 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		CapsuleTask task = new CapsuleTask("牛乳を買う" , 20211021);
		System.out.println("タスク内容は" + task.getContent() + "です。");
		System.out.println("期限は" + task.getDate() + "です。");
		System.out.println("状態は" + task.getStatus() + "です。");
		
		task.setStatus("完了");
		System.out.println("状態は" + task.getStatus() + "です。");
	}

}
