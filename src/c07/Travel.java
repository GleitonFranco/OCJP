package c07;

import java.util.ArrayList;

class Business { }
class Hotel extends Business { }
class Inn extends Hotel { }

public class Travel {
	ArrayList<Hotel> go() {
//		return new ArrayList<Inn>();
		return new ArrayList<Hotel>();
//		return new ArrayList<Object>();
//		return new ArrayList<Business>();
	}
}
