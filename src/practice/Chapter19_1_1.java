package practice;

import java.io.FileWriter;
import java.io.IOException;

public class Chapter19_1_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try (FileWriter fw = new FileWriter("E:\\pleiades\\2024-03\\workspace\\test2.txt", false)) {
			fw.write("あいうえお");
		} catch (IOException e) {
			System.out.println("エラーです");
			e.printStackTrace();
		}
	}
}
