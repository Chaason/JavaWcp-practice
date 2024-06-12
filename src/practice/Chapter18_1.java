package practice;

import java.util.Scanner;

public class Chapter18_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String line = sc.nextLine();
			if(line.equals("exit")) {
				break;
			}
			sb.append(line);
		}
		System.out.println(sb.toString());
		sc.close();
	}
}