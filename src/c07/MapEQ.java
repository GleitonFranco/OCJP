package c07;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class MapEQ {

	public static void main(String[] args) {
		Map<ToDos, String> m = new HashMap<ToDos, String>();
		ToDos t1 = new ToDos("Monday");
		ToDos t2 = new ToDos("Monday");
		ToDos t3 = new ToDos("Tuesday");
		m.put(t1, "doLaundry");
		m.put(t2, "payBills");
		m.put(t3, "cleanAttic");
		System.out.println(m.size());
		
		
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("2");
		pq.add("4");
		System.out.print(pq.peek() + " ");
		pq.offer("1");
		pq.add("3");
		pq.remove("1");
		System.out.print(pq.poll() + " ");
		if(pq.remove("2")) System.out.print(pq.poll() + " ");
		System.out.println(pq.poll() + " " + pq.peek());
		
		Object o = new Object();
		// insert code here
//		Set s = new HashSet();
//		TreeSet s = new TreeSet();
		LinkedHashSet s = new LinkedHashSet();
		s.add("o");
		s.add(o);
		
		
		TreeSet<String> sOri = new TreeSet<String>();
		TreeSet<String> sSubs = new TreeSet<String>();
		sOri.add("a"); sOri.add("b"); sOri.add("c"); sOri.add("d"); sOri.add("e");
		sSubs = (TreeSet)sOri.subSet("b", true, "d", true);
		sOri.add("g");
		sOri.pollFirst();
		sOri.pollFirst();
		sOri.add("c2");
		System.out.println(sOri.size() +" "+ sSubs.size());
	}


}

class ToDos{
	String day;
	ToDos(String d) { day = d; }
	public boolean equals(Object o) {
		return (((ToDos)o).day).equals(this.day);
	}
//	 public int hashCode() { return 9; }
}