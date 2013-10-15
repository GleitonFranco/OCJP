package c1metodos;

public class TesteMetodos implements TestInterface1 {
	
	public synchronized Integer retrieveUserInfo(int id) { return 1; }
	// synchronized modifier can be applied only to methods
	// method can be accessed by only one thread at a time.
	
	public native void codigoEmC();
	// only to methods
	
	public strictfp void calculo() { }
	// only to methods
	// forces floating points (and any floating-point operations) to
	// adhere to the IEEE 754 standard
	
	
}
