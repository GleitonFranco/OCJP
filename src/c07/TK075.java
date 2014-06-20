package c07;

import java.util.Iterator;

import java.util.HashSet;
import java.util.Set;

public class TK075 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		Integer i1 = 45;
		Integer i2 = 46;
		set.add(i1);
		set.add(i1);
		set.add(i2);
		System.out.print(set.size() + " ");
		set.remove(i1);
		System.out.print(set.size() + " ");
		i2 = 47;
		set.remove(i2); 
		System.out.print(set.size() + " ");
	}

}


class TK07555 {

	public static void maine(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		Integer i1 = 45;
		Integer i2 = 46;
		set.add(i1);
		set.add(i1);
		set.add(i2); 
		System.out.print(set.size() + " ");
		set.remove(i1); 
		System.out.print(set.size() + " ");
		i2 = 47;
		for (Iterator i= set.iterator(); i.hasNext();) System.out.println("\n"+i.next());
		set.remove(i2); 
		System.out.print(set.size() + " ");
	}

}
