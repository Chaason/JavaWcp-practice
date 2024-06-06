package classmethod;

import classmethod.human.Human04;

public class ClassMethod04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Human04 yamada = new Human04("山田");
		
		Human04.staticMethodPrint();
		
		System.out.println(Human04.GREETING);
		
		
		yamada.instanceMethodPrint();
	}

}
