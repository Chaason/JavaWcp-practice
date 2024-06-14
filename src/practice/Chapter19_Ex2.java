package practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Chapter19_Ex2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try (FileReader fr = new FileReader("E:\\pleiades\\/2024-03\\workspace\\personal.properties")) {
			Properties p = new Properties();
			p.load(fr);

			//各設定内容を出力
			System.out.println("名前：" + p.getProperty("name"));
			System.out.println("年齢：" + p.getProperty("age"));
			System.out.println("性別：" + p.getProperty("gender"));
			//例外処理を記述
			//printStackTraceで例外出力　
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
