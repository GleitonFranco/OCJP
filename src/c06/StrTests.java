package c06;

public class StrTests {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("set ");
		sb.append("point");
		System.out.println(sb);		// output
		StringBuffer sb2 = new StringBuffer("pi = ");
		sb2.append(3.14159f);
		System.out.println(sb2);
		StringBuilder sb3 = new StringBuilder("0123456789");
		System.out.println(sb3.delete(4,6));
		System.out.println(sb3);

	}

}
