package practice;

import java.sql.SQLException;

public class Chapter12 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			int array[]= {1, 3, 5};
			Chapter12.validIndex(array, 2);
			Chapter12.validIndex(array, 3);
			System.out.println("validIndexの呼び出し終了");
		} catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentExceptionが発生しました");
			e.printStackTrace();
		}
		
		try {
			Chapter12.throwSQLException();
		} catch (SQLException e) {
			System.out.println("SQLExceptionが発生しました");
			e.printStackTrace();
		} finally {
			System.out.println("throwSQLExceptionの呼び出し終了");
		}
		System.out.println("mainメソッド終了");
	}
		
		public static void validIndex(int[]array , int index ) {
			if(array.length <= index) {
				throw new IllegalArgumentException(index + "はサイズの範囲外です");
			}
			System.out.println("インデックス" + index + "の要素数は" + array[index] + "です");
		}
		
		public static void throwSQLException() throws SQLException{
			throw new SQLException("SQLエラーです");
		}
		
	}

