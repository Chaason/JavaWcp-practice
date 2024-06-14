package practice;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Chapter19_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//try-with-resourcesを使用
		try(FileReader fr = new FileReader("E:\\pleiades\\2024-03\\workspace\\test.txt")){
			int c;
			while((c = fr.read()) != -1) {
				System.out.println(c);
			}
		} catch (FileNotFoundException e) {
			System.out.println("ファイルがありませんでした");
			e.printStackTrace();
		} catch(IOException e) {
			System.out.println("エラーです");
			e.printStackTrace();
		}
		System.out.println(System.getProperty("file.encording"));
		
	}

}
