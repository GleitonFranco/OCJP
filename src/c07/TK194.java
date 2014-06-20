package c07;

public class TK194 {

	public static void main(String[] args) {
		Integer x = 400;
		Integer y = x;
		x++;
		System.out.println(x+" "+y);
		StringBuilder sb1 = new StringBuilder("123");
		StringBuilder sb2 = sb1;
		sb1.append("5");
		System.out.println(sb1+" "+sb2);
		System.out.println((x==y) + " " + (sb1==sb2));
	}

}

//What is the result?
//A. true true
//B. false true
//C. true false
//D. false false
//E. Compilation fails.
//F. An exception is thrown at runtime.