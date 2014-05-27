package c10develop;

public class TK39 {

	public static void main(String[] args) {
		System.out.println("inicio");
		try {
			System.out.println("try");
			throw new Exception();
		} catch (Exception e) {
			System.out.println("exception");
			System.out.println(args[5]);
			System.out.println("depois RTE");
		} finally {
			System.out.println("finally");
		}
		System.out.println("out");
	}

}
