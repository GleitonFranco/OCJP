package c08inner.c1regular;

public class MyOuter {
	private int x = 7;

	// inner class definition
	class MyInner {
		public void seeOuter() {
			System.out.println("* Object Inner Class: "+this);
			System.out.println("* Object Outer Class: "+MyOuter.this);
			System.out.println("  - Outer x value: " + x);
		}
	} // close inner class definition
	
	public void makeInner() {
		MyInner in = new MyInner();
		in.seeOuter();
	}
	
	public static void main(String[] args) {
		MyOuter mo = new MyOuter();		// gotta get an instance!
		MyOuter.MyInner inner = mo.new MyInner(); // tem q decorar isto aqui
		MyOuter.MyInner inner2 = new MyOuter().new MyInner(); // a mesma coisa em apenas uma linha
		inner.seeOuter();
	}

}

/* as a member of the outer class, the following modifiers can be applied to a regular inner class:
 final
 abstract
 public
 private
 protected
 static —but static turns it into a static nested class not an inner class
 strictfp
*/
