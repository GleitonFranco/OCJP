package c08inner.c2method;

public class AbstractTest {
	public int getNum() {
		return 45;
	}
	public abstract class Bar {
		public int getNum() {
			return 38;
		}
	}

	public static void main(String[] args) {

		AbstractTest t = new AbstractTest() {
			public int getNum() {
				return 22;
			}
		};
		AbstractTest.Bar f = t.new Bar() {
			public int getNum() {
				return 57;
			}
		};
		System.out.println(f.getNum() + " " + t.getNum());

	}
}

//What is the result?
//		A. 57 22
//		B. 45 38
//		C. 45 57
//		D. An exception occurs at runtime
//		E. Compilation fails

