package enum01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.print("曜日を入力してください");
		String input = new Scanner(System.in).nextLine();
		DayOfWeek week = DayOfWeek.valueOf(input);
		
		switch(week) {
		case Sun:
			System.out.println("日曜日です");
			break;
		case Mon:
			System.out.println("月曜日です");
			break;
		case Tue:
			System.out.println("火曜日です");
			break;
		case Wed:
			System.out.println("水曜日です");
			break;
		case Thu:
			System.out.println("木曜日です");
			break;
		case Fri:
			System.out.println("金曜日です");
			break;
		case Sat:
			System.out.println("土曜日です");
			break;
		}
	}

}
