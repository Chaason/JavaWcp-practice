package polymorphism.practice;

public class Programer extends Human {
	@Override
	public void work() {
		System.out.println("プログラムを書きます");
	}
	
	public void study() {
		System.out.println("技術書を読みます");
	}
}
