package c05;

public class Assertion {


	public static void main(String[] args) {
		int a = -3;
		
		new Assertion().trabalhaComPositivos(a);
	}
	
	public void trabalhaComPositivos(int x) {
		assert (x>0):"valor ="+x;
		System.out.println(x+100);
	}

}
