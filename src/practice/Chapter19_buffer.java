package practice;

import java.io.BufferedReader;
import java.io.FileReader;

public class Chapter19_buffer {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		FileReader fr = new FileReader("");
		BufferedReader br = new BufferedReader(fr);
		for(String line; (line = br.readLine()) != null;) {
			//lineの文字列を処理する
		}
	}

}
