package innner_class_sample;

public class Outer {
	private String greeting = "こんにちは";
	public class Inner {
		public String hello() {
			return greeting; 
			//privateなフィールドでも内部クラス側であれば外部クラス側を参照できる
		}
	}
}
