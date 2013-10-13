package c1metodos;

public abstract class Vehicle {
	private String type;
	public abstract void goUpHill();
	public String getType() {
		return type;
	}
}

abstract class Car extends Vehicle {
	public abstract void goUpHill(); // Still abstract
	public void doCarThings() {
		// special car code goes here
	}
}

class Mini extends Car {
	public void goUpHill() {
		// Mini-specific going uphill code
		// Now we have to implement
	}
}

//The first concrete subclass of an abstract class must implement all abstract
//methods of the superclass.
