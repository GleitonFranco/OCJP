package c03assignments;

public class PrimitiveTests {

	public static void main(String[] args) {
		int a = 100;
		long b = a; // Implicit cast, an int value always fits in a long
		
		float d = 100.001f;
		int e = (int)d; // Explicit cast, the float could lose info
//		int f = d; // possible loss of precision compiler error
		
		double d2 = 100L; // Implicit cast
//		int x = 3957.229; // illegal: explicit cast needed to convert double to int.
		int x = (int)3957.229; // legal cast --> 3957
			
		long l3 = 56L;
		byte b3 = (byte)l3;
		System.out.println("The byte is " + b);// um valor esquisito mas sem compile error
		
		byte b4 = 3;
		b4 += 7;// +=, -=, *=, and /= will all put in an implicit cast
		b4= (byte) (b + 7);		// Won't compile without the cast, since b + 7 results in an int
		
		Integer oi = new Integer(44);
		String s = "a";
		s += b4;
		
	}

}
