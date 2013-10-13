package c1enums;

enum CafeSize {
	MEDIO(50),GRANDE(100),MUITO_GRANDE(200),REALMENTE_OFENSIVO(1000);
	// You can define more than one argument to the constructor, 
	// and you can overload the enum constructors
	CafeSize(int mls) {
		this.mls = mls;
	}
	private int mls;
	public int getMls() {
		return mls;
	}
}

public class CafeCompleto {
	CafeSize size;
	// each instance of Coffee has a CafeSize enum
	public static void main(String[] args) {
		CafeCompleto cafe = new CafeCompleto();
		cafe.size = CafeSize.GRANDE;
		//You can NEVER invoke an enum constructor directly. The enum constructor
		//is invoked automatically, with the arguments you define after the constant value
	}

}
