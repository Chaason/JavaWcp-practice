package practice;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Chapter19_Ex1 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		String allData = Files.readString(Paths.get("E:\\pleiades\\2024-03\\workspace\\input.csv"), StandardCharsets.UTF_8);
		
		String[]lines = allData.split("\n");
		StringBuffer sb = new StringBuffer();
		for(String line : lines) {
			String[]items = line.split(",");
			sb.append(items[0]).append(",").append(items[6]).append("\n");
		}
		Files.writeString(Paths.get("E:\\pleiades\\2024-03\\workspace\\output.csv"),sb.toString());
	}

}
