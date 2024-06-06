package practice;

public class Task {
	private int date;
	private String content;
	private boolean done;
	
	public Task(int date, String content) {
		this.date = date;
		this.content = content;
	}
	
	public void done() {
		done = true;
		System.out.println("タスク" + content + "を完了します。");
	}
	
	public void  print() {
		if(done) {
			System.out.println(date + "のタスク" + content + "は完了しています。");
		}else {
			System.out.println(date + "のタスク" + content + "は未完了です。");
		}
	}
}
