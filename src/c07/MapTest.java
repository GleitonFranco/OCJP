package c07;

import java.util.HashMap;
import java.util.Map;


enum Pets {DOG, CAT, HORSE }

class MapTest {
	public static void main(String[] args) {
		Map<Object, Object> m = new HashMap<Object, Object>();
		m.put("k1", new Dog("aiko"));
		m.put("k2", Pets.DOG);
		m.put(Pets.CAT, "CAT key");		// add some key/value pairs
		Dog d1 = new Dog("clover");		// let's keep this reference
		m.put(d1, "Dog key");
		m.put(new Cat(), "Cat key");
		System.out.println(m.get("k1"));
		String k2 = "k2";
		System.out.println(m.get(k2));
		Pets p = Pets.CAT;
		System.out.println(m.get(p));
		System.out.println(m.get(d1));
		System.out.println(m.get(new Cat()));
		System.out.println("size map="+m.size());
		
		d1.name = "magnolia";
		System.out.println(m.get(d1));// d1 nao e mais achado
		
		d1.name = "clover";
		System.out.println(m.get(new Dog("clover")));
		d1.name = "arthur"; // mesmo num de caracteres
		System.out.println(m.get(new Dog("clover")));
		
//		1. Use the hashCode() method to find the correct bucket
//		2. Use the equals() method to find the object in the bucket
	}
}
