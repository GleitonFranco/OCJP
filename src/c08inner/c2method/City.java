package c08inner.c2method;

public class City {
	
	class Manhattan {
		void doStuff() throws Exception { System.out.print("x "); }
	}
	
	class TimesSquare extends Manhattan {
		void doStuff() throws Exception { }
	}

	public static void main(String[] args) {
//		new City().go();
	}

	void go() throws Exception { new TimesSquare().doStuff(); }

}