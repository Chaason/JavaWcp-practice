package classmethod;

import classmethod.human.Human03;

public class Classmethod03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Human03 yamada = new Human03();
		
		System.out.println("私の名前は、" + yamada.name + "です");
		String profile = yamada.getProfile();
		System.out.println(profile + "です");
		
		yamada.greet("田辺");
		yamada.greet(null);
	}

}
