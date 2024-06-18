package innner_class_sample;

public class Outer2 {
	private  String greeting = "こんにちは";
	
	public static  class StaticInner{
		public String hello() {
		return greeting;
		//内部クラスがstaticな場合は外部クラスのフィールドを参照できない
		//ただし、外部クラスのフィールドがstaticであれば参照できる
		}
	}
}
