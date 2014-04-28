package c07;

public class Dog extends Animal {
	public String name;

	public Dog() {};
	public Dog(String n) { name = n; }
	public boolean equals(Object o) {
		if((o instanceof Dog) &&
				(((Dog)o).name == name)) {
			return true;
		} else {
			return false;
		}
	}
	public int hashCode() {return name.length(); }

}
