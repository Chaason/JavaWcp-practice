package nonameclass;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class L3Chapter7_Ex1 {

	public static void main(String[] args) {
		List<String> animals = Arrays.asList("dog", "cat", "fox", "elephant");
		//animals.sort(Comparator.naturalOrder());　←このコードでいけるｗ
		//System.out.println(animals);
		Collections.sort(
		animals,
		new Comparator<String>() {
			@Override
			public int compare(String x, String y) {
				return x.compareTo(y);
			}
		});
		System.out.println(animals);
	}

}
