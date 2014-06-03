package c02oo;


class ClassAA {
	public int numberOfInstances;
	protected ClassAA(int numberOfInstances) {
		this.numberOfInstances = numberOfInstances;
	}
}

public class ExtendedA extends ClassAA {
	private ExtendedA(int numberOfInstances) {
		super(numberOfInstances);
	}
	public static void main(String[] args) {
		ExtendedA ext = new ExtendedA(420);
		System.out.print(ext.numberOfInstances);
	}
}

//Which statement is true?
//A. 420 is the output.
//B. An exception is thrown at runtime.
//C. All constructors must be declared public.
//D. Constructors CANNOT use the private modifier.
//E. Constructors CANNOT use the protected modifier.