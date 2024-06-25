package lambda;

public class FuncList {
	public static void main(String[] args) {
		/*public boolean isOdd(int x) {
			return x % 2 == 1;
		}
		public String addNamePrefix(boolean male, String name) {
			if(male) {
				return "Mr." + name;
			}else {
				return "Ms." + name;
			}
		}*/

		Func1 f1 = x -> x % 2 == 1;
	      //引数のx　↑    　　↑　isOddメソッドの実装

		Func2 f2 = (male, name) -> {
			   //引数2個　↑　
			//↓  addNamePrefixメソッドの実装
			if (male) {
				return "Mr." + name;
			} else {
				return "Ms." + name;
			}
		};
		System.out.println(f1.isOdd(15));
		System.out.println(f2.addNamePrefix(true, "Mike"));
	}	
}
