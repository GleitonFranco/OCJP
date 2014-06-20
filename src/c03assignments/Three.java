package c03assignments;

class One {
	public One foo() { return this; }
}

class Two extends One {
	public One foo() { return this; }
}

public class Three extends Two {
//	public void foo() {}
//	public int foo() { return 3; }
//	public Two foo() { return this; }
//	public One foo() { return this; }
//	public Object foo() { return this; }
}

//Which two methods, inserted individually, correctly complete the Three class? (Choose two.)