package c08inner.c3anonymous;

public class Food {
	Popcorn p = new Popcorn() {
		public void pop() {
			System.out.println("anonymous popcorn");
		}
	};
	
}



class Popcorn {
	public void pop() {
		System.out.println("popcorn");
	}
}