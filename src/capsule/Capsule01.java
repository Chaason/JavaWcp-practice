package capsule;

import capsule.human.HumanCapsule;
import capsule.human.HumanNoCapsule;

public class Capsule01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		HumanNoCapsule human1 = new HumanNoCapsule("田中" ,28);
		System.out.println("名前は" + human1.name + ",　年齢は" + human1.age + "です");
		human1.name = "今田";
		human1.age = 70;
		System.out.println("名前は" + human1.name + ",　年齢は" + human1.age + "です");
		
		HumanCapsule human2 = new HumanCapsule("小林" , 32);
		human2.setName("三村");
		System.out.println("名前は" + human2.getName() + ",　年齢は" + human2.getAge() + "です");
	}

}
