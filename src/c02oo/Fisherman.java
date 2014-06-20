package c02oo;

interface Fish { }
class Perch implements Fish { }
class Walleye extends Perch { }
class Bluegill { }
class Salmon implements Fish { }


public class Fisherman {

	public static void main(String[] args) {
		Fish f = new Walleye();
		Walleye w = new Walleye();
		Bluegill b = new Bluegill();
		TK066 t = new TK066();
		if(f instanceof Perch) System.out.print("f-p ");
		if(w instanceof Fish) System.out.print("w-f ");
		if(b instanceof Fish) System.out.print("b-f ");
		if(t instanceof Fish) System.out.print("f-p ");
		System.out.println("\n"+(new Perch() instanceof Walleye));
		System.out.println(new TK066() instanceof Fish);
//		System.out.println(new Bluegill() instanceof Walleye);
//		System.out.println(new Walleye() instanceof Bluegill);
//		System.out.println(new Walleye() instanceof Salmon);
	}
	
}






//Operands of instanceof must be in the same inheritance tree.