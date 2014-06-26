package c05;

public class TK240 {

	public static void main(String[] args) {
		try {
			A a = new A();
			a.method1();
		} catch (Exception e) {
			System.out.println("an error occurred");
		}
		System.out.println("FIM");
	}
}

class A {
	public void method1()  {
		B b = new B();
		b.method2();
		System.out.print("B-2");
	}
}

class B {
	public void method2()  {
		C c = new C();
		c.method3();
		
	}
}

class C {
	public void method3()  {
		throw new NullPointerException();
	}
}
