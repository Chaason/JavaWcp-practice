package practice;

public class Lesson3Chapter1_ExMain {

	public static void main(String[] args) {
		
		Lesson3Chapter1_Ex ex = new Lesson3Chapter1_Ex();
		Lesson3Chapter1_Ex.Human human = ex.new Human();
		Lesson3Chapter1_Ex.Human.HumanLeg leg = human.new HumanLeg();
		
		leg.kick();
	}

}
