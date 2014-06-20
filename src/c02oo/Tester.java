package c02oo;

interface Colorable { }

interface Bouncable extends Colorable { }

class Super implements Bouncable { }

class Sub extends Super implements Bouncable { }

class Individual { }

public class Tester {

	public static void main(String[] args) {

		System.out.print(new Sub() instanceof Super);

		System.out.print(new Sub() instanceof Colorable);

		System.out.print(new Super() instanceof Sub);

//		System.out.print(new Individual() instanceof Super);

	}

}



//Individual and Super are incompatible, so using instanceof causes a compilation error.
//Operands of instanceof must be in the same inheritance tree.