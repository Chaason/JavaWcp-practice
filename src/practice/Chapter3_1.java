package practice;

import java.util.Date;

public class Chapter3_1 {

	public static void main(String[] args) {
		
		//引数なしでインスタンス化すると現在の日時情報が格納される
		Date now = new Date(); 
		System.out.println(now);
		System.out.println(now.getTime());
		
		//long値を引数としてインスタンス化すると指定の日時の情報が格納される
		Date past = new Date(163484397000L); 
		System.out.println(past);
	
	}

}
