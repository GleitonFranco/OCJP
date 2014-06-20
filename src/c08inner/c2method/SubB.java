package c08inner.c2method;

class X { public void foo() { System.out.print("X "); } }

public class SubB extends X {
	public void foo() throws RuntimeException {
		super.foo();
		if (true) throw new RuntimeException();
		System.out.print("B ");
	}

	public static void main(String[] args) {
		new SubB().foo();
	}

}
