package c08inner.c1regular;

public class Car {

	class Engine {
		// insert code here
	}
	
	public static void main(String[] args) {
		new Car().go();
	}

	void go() {
		new Engine();
	}
	
	void drive() { System.out.println("hi"); }

}

//Which, inserted independently at line 5, produce the output "hi"? (Choose all that apply.)
//A. { Car.drive(); }
//B. { this.drive(); }
//C. { Car.this.drive(); }
//D. { this.Car.this.drive(); }
//E. Engine() { Car.drive(); }
//F. Engine() { this.drive(); }
//G. Engine() { Car.this.drive(); }