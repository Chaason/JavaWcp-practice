package polymorphism.practice;

public abstract class Human {
	private int hp = 100;
	
	public void doSleep() {
		hp += 50;
		System.out.println("hp=" + hp);
	}
	
	public abstract void work();
}
