package c1enums;

enum CoffeeSize { BIG, HUGE, OVERWHELMING }//only public or default, if outside
//sim, pode ser declarado fora da classe
// NUNCA dentro de métodos
//";" no final é opcional p enums

class Coffee {
	CoffeeSize size;
}

public class CoffeeTest1 { //nome do arquivo .java leva o nome da classe pública
	public static void main(String[] args) {
		Coffee drink = new Coffee();
		drink.size = CoffeeSize.BIG;
		//enum outside class
	}
}