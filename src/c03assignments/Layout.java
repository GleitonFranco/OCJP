package c03assignments;

public class Layout {
	static int s = 343; // static variable
	int x; // instance variable

	{ x = 7; int x2 = 5; } // initialization block

	Layout() { x += 8; int x3 = 6;} // constructor
	
	void doStuff() { // method
		int y = 0; // local variable
		for(int z = 0; z < 4; z++) {
			y += z + x;
		}
	}
}
