package c1construtor;

public class Foo {
	protected Foo() {
		// construtor
	}
//  outros contrutores legais	
//	private Foo() { }
//	Foo(int x) { }
//	Foo(int x, int... y) { }
	
	protected void Foo() {
		// metodo, legal embora pessimamente nomeado
	}
	
//	construtores ILEGAIS
//	Form() { }
//	Foo();
//	static Foo() { }
//	final Foo() { }
//	abstract  Foo() { }
	
}
