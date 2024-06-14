package practice;

public class Chapter18_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= 100; i++) {
			sb.append(i).append(",");
		}

		String data1 = new String(sb);
		//System.out.println(sb);

		int a = data1.indexOf("1");
		int b = data1.lastIndexOf(",");
		String data2 = data1.substring(a, b);

		//System.out.println(data2);

		String[] ans = data2.split(",");
		for (String m : ans) {
			System.out.println(m);
		}

	}

}
