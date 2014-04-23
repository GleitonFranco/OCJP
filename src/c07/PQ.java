package c07;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PQ {
	static class PQsort
	implements Comparator<Integer> { // inverse sort
		public int compare(Integer one, Integer two) {
			return two - one; // unboxing
		}
	}
	public static void main(String[] args) {
		int[] ia = {1,5,3,7,6,9,8 }; // unordered data
		PriorityQueue<Integer> pq1 =
				new PriorityQueue<Integer>(); // use natural (default) order
		for(int x : ia) // load queue
			pq1.offer(x);// offer() method to add elements to the PriorityQueue
		for(int x : ia) // review queue
			System.out.print(pq1.poll() + " ");// poll() returns the highest priority entry AND removes the entry from the queue.
		System.out.println("");
		PQsort pqs = new PQsort(); // get a Comparator
		PriorityQueue<Integer> pq2 =
				new PriorityQueue<Integer>(10,pqs); // use Comparator order
		for(int x : ia) // load queue
			pq2.offer(x);
		System.out.println("size " + pq2.size());
		System.out.println("peek " + pq2.peek());// peek() returns the highest priority element in the queue without removing it
		System.out.println("size " + pq2.size());
		System.out.println("poll " + pq2.poll());
		System.out.println("size " + pq2.size());
		for(int x : ia) // review queue
			System.out.print(pq2.poll() + " ");
	}

}
