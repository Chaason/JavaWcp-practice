package practice;

import polymorphism.practice.Doctor;
import polymorphism.practice.Driver;
import polymorphism.practice.Human;
import polymorphism.practice.Programer;
import polymorphism.practice.Student;
import polymorphism.practice.Teacher;

public class Chapter16 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Human[]humans = new Human[] {
				new Student(),
				new Programer(),
				new Driver(),
				new Teacher(),
				new Doctor()
		};
		
		for(Human h : humans) {
			h.work();
			if(h instanceof Programer) {
				//Humanクラスの変数hをProgramerクラスにダウンキャストしている
				//study()メソッドはHumanクラスにはなく、Programerクラスにしかないからダウンキャストする必要がある
				((Programer)h).study(); 
			}
		}
	}

}
