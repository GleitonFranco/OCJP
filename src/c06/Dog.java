package c06;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Dog implements Serializable {
	transient private Collar theCollar; // we can't serialize this
	private int dogSize;
	public Dog(Collar collar, int size) {
		theCollar = collar;
		dogSize = size;
	}
	public Collar getCollar() { return theCollar; }
	private void writeObject(ObjectOutputStream os) {
		// throws IOException {
		try {
			os.defaultWriteObject();
			os.writeInt(theCollar.getCollarSize());
		} catch (Exception e) { e.printStackTrace(); }
	}
	private void readObject(ObjectInputStream is) //throws IOException, ClassNotFoundException 
	{
			try {
				is.defaultReadObject();
				theCollar = new Collar(is.readInt());
			} catch (ClassNotFoundException e) { e.printStackTrace(); 
			} catch (IOException e) { e.printStackTrace(); }
	}
}


class Collar {
	private int collarSize;
	public Collar(int size) { collarSize = size; }
	public int getCollarSize() { return collarSize; }
}

