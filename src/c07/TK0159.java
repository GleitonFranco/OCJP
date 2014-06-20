package c07;

import java.util.ArrayList;
import java.util.Collections;

public class TK0159 {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1); a.add(5); a.add(3);
		Collections.sort(a);
		System.out.println(a);
		a.add(2);
		System.out.println(a);
		Collections.reverse(a);
		System.out.println(a);
	}

}
