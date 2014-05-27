package c06;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TK032 implements Serializable {

	public int x,y;
	
	public TK032(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	private void writeObject(ObjectOutputStream os) throws IOException {
		os.writeInt(x);
		os.writeInt(y);
	}
	
	private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {
		
	}
	
}
// Which code, inserted at line 23, will allow this class to correctly serialize and deserialize?
//A. s.defaultReadObject();
//B. this = s.defaultReadObject();
//C. y = s.readInt(); x = s.readInt();
//D. x = s.readInt(); y = s.readInt();
