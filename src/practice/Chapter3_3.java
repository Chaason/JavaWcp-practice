package practice;

import java.time.LocalDateTime; //現在日時を表す
import java.time.format.DateTimeFormatter; //日付と文字列の相互変換を行う

public class Chapter3_3 {

	public static void main(String[] args) throws Exception {
		//現在日時の取得
		LocalDateTime localDateTime = LocalDateTime.now();
		
		//文字列へ変換
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		
		System.out.println(dateTimeFormatter.format(localDateTime));

	}

}
