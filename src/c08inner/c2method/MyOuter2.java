package c08inner.c2method;

public class MyOuter2 {

	private String x = "Outer2";
	
	void doStuff() {
		
		String z = "local variable";
		
		class MyInner {
//			private String x = "Inner2";
			public void seeOuter() {
				System.out.println("Outer x is " + x);
//				System.out.println("Local variable z is " + z); // Won't Compile! So se for final OU abstract
			} // close inner class method
		} // close inner class definition
		
		MyInner mi = new MyInner();		// This line must come after the class
		
		mi.seeOuter();
		
	} // close outer class method doStuff()
	
	
	
	public static void main( String ... args ) {
		MyOuter2 o2 = new MyOuter2();
		o2.doStuff();
	}
	
}
