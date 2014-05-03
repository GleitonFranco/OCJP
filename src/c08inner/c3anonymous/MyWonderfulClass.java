package c08inner.c3anonymous;

/*
 *  Exemplo de classe interna anonima instanciada no argumento de um metodo  
 */

public class MyWonderfulClass {
	void go() {
		Bar b = new Bar();

		b.doStuff(new Foo() {
			public void foof() {
				System.out.println("foofy");
			} // end foof method
		}); // end inner class def, arg, and b.doStuff stmt.
		
	} // end go()
} // end class



interface Foo {
	void foof();
}

class Bar {
	void doStuff(Foo f) { }
}
