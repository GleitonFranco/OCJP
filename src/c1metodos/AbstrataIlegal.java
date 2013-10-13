package c1metodos;

public class AbstrataIlegal { 
	// It is illegal to have even a single abstract method in a class that is not explicitly declared abstract
	public abstract void doIt();
	
	abstract static void doStuff();// abstract modifier can never be combined with the static modifier
	
	final static void doStuff2();// abstract modifier can never be combined with the final modifier
}

abstract class AbstrataLegal { // Isso pode
	void goodMethod() {
		// lots of real implementation code here
	}
}
