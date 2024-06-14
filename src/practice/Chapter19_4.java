package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Chapter19_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try(FileInputStream fis = new FileInputStream("E:\\pleiades\\2024-03\\workspace\\test.txt")){
				int c ;
				while((c = fis.read()) != -1) {
					System.out.println(Integer.toHexString(c));
				}
		} catch (FileNotFoundException e) {
			System.out.println("ファイルｇがありませんでした");
			e.printStackTrace();
		} catch(IOException e) {
			System.out.println("エラーです");
			e.printStackTrace();
		}
	}

}
