package c1interface;

public interface TestInterface1 { // implicitamente abstratas (declaracao explicita redundante) 
									// podem ser public ou default
	// All interface methods are implicitly public and abstract
	public abstract void met_declarado_redundante();
	void met_declarado_nao_redundante();//Ends with a semicolon rather than curly braces
	// Because interface methods are abstract, they cannot be marked final, strictfp, or native
	static void metodo_ilegal1(); 
	final void metodo_ilegal2();
	native void metodo_ilegal3();
	strictfp void metodo_ilegal4();
	
	private void bounce(); // interface methods are always public
	protected void bounce();// interface methods are always public
}

interface InterfaceFoo {
	int BAR = 42; //  variaveis, se houver, implicitamente public static final , o.s., constantes
	void go();
}