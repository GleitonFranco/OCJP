package c02oo;

public class TK066 {

	public static void main(String[] args) {
		ClassA p0 = new ClassA();
		ClassB p1 = new ClassB();
		ClassC p2 = new ClassC();
		ClassA p3 = new ClassB();
		ClassA p4 = new ClassC();
		
//		Which three are valid? (Choose three.)
//		p0 = p1;
//		p1 = p2;
//		p2 = p4;
//		p2 = (ClassC)p0;
//		p1 = (ClassB)p3;
//		p2 = (ClassC)p4;
	}

}


class ClassA {}
class ClassB extends ClassA {}
class ClassC extends ClassA {}