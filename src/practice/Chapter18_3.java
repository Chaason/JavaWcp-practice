package practice;

public class Chapter18_3 {
	public static void main(String[]args) {
		
		String postNumber = new String("000-1234");
		String phoneNumber = new String("080-1111-2222");
		String time = new String("20時55分");
		
		if(postNumber.matches("\\d{3}-\\d{4}")) {
			System.out.println(postNumber);
		};
		
		if(phoneNumber.matches("(070|080|090)-\\d{4}-\\d{4}")){
			System.out.println(phoneNumber);
		}
		
		if(time.matches("([01]\\d|2[0-3])時[0-5]\\d分")) {
			System.out.println(time);
		}
	}
}
