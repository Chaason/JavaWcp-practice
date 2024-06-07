package practice;

public class CapsuleTask {
	private String content;
	private int date;
	private String status;
	
	public CapsuleTask(String content, int date) {
		this.content = content;
		this.date = date;
		this.status = "未完了";
	}
	
	public String getContent() {
		return this.content;
	}
	
	public int getDate() {
		return this.date;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
}
