
public class Recursive01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int number = 1;
		printNum(number);
	}
	
	public static int printNum(int number) {
		if(number < 50) {
			number *= 2;
			System.out.println("While = " + number);
			printNum(number);
		}
		return number;
	}

}
