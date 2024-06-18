package innner_class_sample;

public class Constants {
		public static final String CAT_NAME = "猫";

		public static final int CAT_LEG_COUNT = 4;

		public static final String OCTOPUS_NAME = "タコ";

		public static final int OCTOPUS_LEG_COUNT = 8;
	
	}
//これを内部クラスで書き換えると・・・↓↓↓

public static class constants{
	public static class Cat{
		public static final String NAME = "猫";
		public static final int LEG_COUNT = 4;
	}
	
	public static class OCTOPUS{
		public static final String NAME = "タコ";
		public static final int LEG_COUNT = 8;
	}
	
}