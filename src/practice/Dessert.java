package practice;

public enum Dessert {
	APPLE(100),ICE_CREAM(200),CAKE(300);
	/* コンパイルすると上記の定数が次のようになる
	public static final Dessert APPLE = new Dessert(100);
	public static final Dessert ICE_CREAM = new Dessert(200);
	public static final Dessert CALE = new Dessert(300);
	 */
	
	private int price; //値段を保持するための変数
	
	private Dessert(int price) { //privateコンストラクタを追加（値段の初期設定）
		this.price = price;
	}
	
	public int getPrice() { //値段を取得するメソッド
		return this.price;
	}
	
	static void printDessertName(Dessert dessert){
	    System.out.println(dessert);
	}
	
	public static void main(String[]args) {
		System.out.println(Dessert.APPLE);
		System.out.println(Dessert.CAKE);
		
		Dessert apple = Dessert.APPLE;
		System.out.println(apple);
		
		printDessertName(Dessert.APPLE);
		
		System.out.println(Dessert.APPLE.getPrice());
		System.out.println(Dessert.ICE_CREAM.getPrice());
		System.out.println(Dessert.CAKE.getPrice());
	}
}
