package c1enums;

enum CoffeeSize { BIG, HUGE, OVERWHELMING } // this cannot be private or protected
//sim, pode ser declarado fora da classe. ";" no final é opcional p enums

class Coffee {
	CoffeeSize size;
}

public class CoffeeTest1 {
	public static void main(String[] args) {
		Coffee drink = new Coffee();
		drink.size = CoffeeSize.BIG;
		//enum outside class
	}
}