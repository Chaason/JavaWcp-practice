package practice;

//インスタンスごとにメソッドを追加できる。
//抽象メソッドを用意して継承・オーバーライドするとインスタンスごとで設定できる
public enum Dessert2 {  
	APPLE(100){
		@Override
		void advertise() {
			System.out.println("まっかなりんごが" + getPrice() + "円！"); // getPriceメソッドも活用できる)
		}
	},
	
	ICE_CREAM(200){
		@Override
		void advertise() {
			System.out.println("夏にぴったりアイスクリームが" + getPrice() + "円！");
		}
	},
	CAKE(300){
		@Override
		void advertise() {
			System.out.println("皆大好き甘いケーキが" + getPrice() + "円！");
		}
	};
	
	private int price; //値段を保持するための変数
	
	private Dessert2(int price) { //privateコンストラクタを追加（値段の初期設定）
		this.price = price;
	}
	
	public int getPrice() { //値段を取得するメソッド
		return this.price;
	}
	
	abstract void advertise(); //宣伝文句を出力する抽象メソッド。各インスタンスで実装
	
	
	static void printDessertName(Dessert2 dessert){
	    System.out.println(dessert);
	}
	
	
	//実行用メインメソッド
	public static void main(String[]args) {
		System.out.println(Dessert2.APPLE);
		System.out.println(Dessert2.CAKE);
		
		Dessert2 apple = Dessert2.APPLE;
		System.out.println(apple);
		
		printDessertName(Dessert2.APPLE);
		
		System.out.println(Dessert2.APPLE.getPrice());
		System.out.println(Dessert2.ICE_CREAM.getPrice());
		System.out.println(Dessert2.CAKE.getPrice());
		
		
		Dessert2.APPLE.advertise();
		Dessert2.ICE_CREAM.advertise();
		Dessert2.CAKE.advertise();
		
	}
}

