package c08inner.c3anonymous;

public class Test {
	public static void main(String[] args) {
		Animal h = new Horse();
		h.eat(); // Legal, class Animal has an eat() method
//		h.buck(); // Not legal! Class Animal doesn't have buck()
	}
}

class Horse extends Animal{
	void buck() { }
}

class Animal {
	void eat() { }
}
