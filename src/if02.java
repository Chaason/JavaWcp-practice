
public class if02 {
	public static void main(String[]args) {
		int number = 7;
		
		if(number < 5) {
			System.out.println(number + "は５未満です");
		}else if (number < 10) {
			System.out.println(number + "は５以上１０未満です");
		}else if (number <15) {
			System.out.println(number + "は１０以上１５未満です");
		}else {
			System.out.println(number + "は１５未満でないです");
		}
	}
}
