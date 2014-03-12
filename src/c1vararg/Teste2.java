package c1vararg;

public class Teste2 {

	public static void main(String[] args) {
		int i1 = 10;
		int i2 = 0xDeadCafe;
		Integer i3 = 1000;
		System.out.println(i1+" "+i2+" "+i3+": "+i3.byteValue());
		
		byte a1 = 3; // No problem, 3 fits in a byte
		byte a2 = 8; // No problem, 8 fits in a byte
		byte a3 = (byte) (a2 + a1);
		float f1 = 1234.5848394f;
		int fi = (int) f1;
		double d = 13544.613599;
		int di = (int) d;
		System.out.println(fi);
		
		long l = 129L;
		byte b = (byte)l;
		System.out.println("The byte is " + b);
		
		float f = 234.56F;
		short s = (short)f;
		System.out.println(s);
		String s1 = Integer.toBinaryString(i3);
		System.out.println(s1);
	}

}

