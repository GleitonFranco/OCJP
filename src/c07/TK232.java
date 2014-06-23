package c07;

import java.util.List;

public class TK232 {

//	public void addStrings(List list) { // A
	public void addStrings(List<String> list) { // B
//	public void addStrings(List<? super String> list) { // C
//	public void addStrings(List<? extends String> list) { // D
		list.add("foo");
	}
	
	public void someMethod(Object value) {
		// check for null value
		if (value == null) { throw new IllegalArgumentException("value is null"); }
//		assert value != null, "value is null";
//		if (value == null) { throw new AssertionException("value is null"); }
//		assert value == null;
		System.out.println(value.getClass());
	}
	
}
