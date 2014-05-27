package c07;

import java.util.Iterator;
import java.util.List;

public class Q01 {
	public static int sum(List<Integer> list) {
		int sum = 0;
		for ( Iterator<Integer> iter = list.iterator(); iter.hasNext(); ) {
			int i = ((Integer)iter.next()).intValue();
			int i2 = iter.next();
			sum += i;
		}
		return sum;
	}
}