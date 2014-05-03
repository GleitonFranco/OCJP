package c08inner.c3anonymous;

public class Food2 {

	Cookable c = new Cookable() { // nao uma instancia de interface, mas a instancia de uma IMPLEMANTACAO anonima de interface
		public void cook() {
			System.out.println("anonymous cookable implementer");
		}
	};

}

interface Cookable {
	public void cook();
}

//Outro exemplo classico com classe anonima implementando interface 
//Runnable r = new Runnable() {
//public void run() { }
//};