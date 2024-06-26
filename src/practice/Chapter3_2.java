package practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Chapter3_2 {

	public static void main(String[] args) throws Exception {
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
		//文字列からDateインスタンスを生成
		Date d = f.parse("2024/06/18 21:43:30");
		System.out.println(d);
		
		//Dateインスタンスから文字列を生成
		Date now = new Date();
		String s = f.format(now);
		System.out.println(s);
	}

}
