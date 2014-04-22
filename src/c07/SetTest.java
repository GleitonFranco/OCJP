package c07;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		boolean[] ba = new boolean[5];
		Set s = new HashSet();
		
//		Set s = new TreeSet(); 
		//Vai dar R.T.E.; tipos diferentes nao costumam ser comparable
		
		ba[0] = s.add("a");
		ba[1] = s.add(new Integer(42));
		ba[2] = s.add("b");
		ba[3] = s.add("a");
		ba[4] = s.add(new Object());
		for(int x=0; x<ba.length; x++)
			System.out.print(ba[x] + " ");
		System.out.println("\n");
		for(Object o : s)
			System.out.print(o + " ");
	}

}
