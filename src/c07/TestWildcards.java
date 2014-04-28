package c07;

import java.util.ArrayList;
import java.util.List;

public class TestWildcards {

	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<Integer>();
		Bar bar = new Bar();
		bar.doInsert(myList); // compila ca mas nao la
//		bar.doInsert2(myList); // compila la mas nao ca
		
		List<Cat> gatos = new ArrayList<Cat>();
		//add(gatos); // NAO, para evitar RTEs por erros como o abaixo
		
		
		Cat[] catsArray = new Cat[3];
		Cat gato0 = catsArray[0];// vai botar um Dog em gato0 (RTE)
		
		
//		List<Animal> clist = new ArrayList<Cat>(); // NAO!
		List<?> list = new ArrayList<Dog>();
		List<? extends Animal> aList = new ArrayList<Dog>();
//		List<?> foo = new ArrayList<? extends Animal>(); // cannot use wildcard notation in the object creation.
//		List<? extends Dog> cList = new ArrayList<Integer>(); // cannot assign an Integer list to a reference that takes only Dog and its subtypes
		List<? super Dog> bList = new ArrayList<Animal>();
//		List<? super Animal> dList = new ArrayList<Dog>(); // Dog is too "low" in the class hierarchy. Only <Animal> or <Object> would have been legal.
	}
	
	void add(List<Animal> list) {
		list.add(new Dog());
	}
	
	static class Bar {
		void doInsert(List<?> list) {
			list.add(new Dog());
		}
		
		void doInsertSuper(List<? extends Animal> list) { // legal, mas não permite inserir
//			list.add(new Dog());
		}
		
		void doInsert2(List<Object> list) {
			list.add(new Dog());
		}
		
		void addArray(Animal[] a) {
			a[0] = new Dog(); // Compila as duas classes, mas vai dar RTE la na frente
		}
	}
	
	
}
