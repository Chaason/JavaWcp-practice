package practice;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;


public class Chapter3_Ex {

	public static void main(String[] args) {
		//当日のインスタンスからwithDayOfManthでその月の1日のインスタンスを得る
		LocalDate d = LocalDate.now().withDayOfMonth(1); 
		
		//lengthOfManthでその月の最後の日が取得出来る
		final int lastDay = d.lengthOfMonth();
		
		for(int i = 1; i <= lastDay; i++) {
			DayOfWeek w = d.getDayOfWeek(); 
			String wstr = w.getDisplayName(TextStyle.SHORT, Locale.getDefault());
			System.out.print(d.getDayOfMonth() + "(" + wstr + ")");
			
			//土曜か判定して土曜だったら改行を入れる
			if(w == DayOfWeek.SATURDAY) {
				System.out.println();
			}
			
			d = d.plusDays(1);
		}

	}

}
