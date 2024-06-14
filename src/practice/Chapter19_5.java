package practice;

import java.io.ByteArrayOutputStream;

public class Chapter19_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		bos.write(0x41);//A
		bos.write(0x42);//B
		bos.write(0x43);//C
		byte[]data = bos.toByteArray();
		for(byte b: data) {
			System.out.print(Integer.toHexString(b) + " ");
		}
	}

}
