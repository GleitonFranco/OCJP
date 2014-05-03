package c08inner.c4staticnested;

class BigOuter {
	static class Nest {void go() { System.out.println("hi"); } }
}

public class Broom {
	static class B2 {void goB2() { System.out.println("hi 2"); } }
	public static void main(String[] args) {
		BigOuter.Nest n = new BigOuter.Nest();		// diferente de c08inner.c1regular.MyOuter2
		n.go();
		B2 b2 = new B2();		// access the enclosed class
								// main() is static, so B2 must be static too
		b2.goB2();
	}
}
