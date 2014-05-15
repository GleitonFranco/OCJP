package c09threads;

import java.util.LinkedList;
import java.util.List;

public class NameList2 {
	
	private List names = new LinkedList();
	
	public synchronized void add(String name) {
		names.add(name);
	}
	
	public synchronized String removeFirst() {
		if (names.size() > 0)
			return (String) names.remove(0);
		else
			return null;
	}
	
}
