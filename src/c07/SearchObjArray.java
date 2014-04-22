package c07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SearchObjArray {

	public static void main(String[] args) {
		String [] sa = {"one", "two", "three", "four"};
		// #1 Sort the sa array, alphabetically (the natural order).
		Arrays.sort(sa);
		printArray(sa);
		// #2 Search for the location of element "one", which is 1.
		System.out.println("\none = "+ Arrays.binarySearch(sa,"one"));
		System.out.println("now reverse sort");
		// #3 Make a Comparator instance
		RevSortComparator rs = new RevSortComparator();
		Arrays.sort(sa,rs);
		printArray(sa);
		// #4 Without the Comparator we used to sort the array, so we got an incorrect (undefined) answer.
		System.out.println("\none = "+ Arrays.binarySearch(sa,"one"));
		// #5 Search again, passing the Comparator to binarySearch()
		System.out.println("one = "+ Arrays.binarySearch(sa,"one",rs));
		
		
		// Arrays.asList()
		System.out.println("\n------AS LIST------");
		printArray(sa);
		List sList = Arrays.asList(sa);		// make a List
		System.out.println("size list " + sList.size());
		System.out.println("idx(2) " + sList.get(2));
		sList.set(3,"six");		// change List
		sa[1] = "five";		// change array
		printArray(sa);
		printList(sList);  // array e list estao sincronizados
		System.out.println("\nsl[1] " + sList.get(1));
		
		// List.toArray(...)
		System.out.println("\n------TO ARRAY------");
		List<Integer> iL = new ArrayList<Integer>();
		for(int x=0; x<3; x++)
			iL.add(x);
		Object[] oa = iL.toArray();		// create an Object array
		Integer[] ia2 = new Integer[3];
		ia2 = iL.toArray(ia2);		// create an Integer array
	}
	
	private static void printArray(String[] sa) {
		for(String s : sa)
			System.out.print(s + " ");
		System.out.println();
	}
	
	private static void printList(List<String> sa) {
		for(String s : sa)
			System.out.print(s + " ");
		System.out.println();
	}

	static class RevSortComparator implements Comparator<String> {
		public int compare(String a, String b) {
			return b.compareTo(a);// inverted sort
		}
	}

}
