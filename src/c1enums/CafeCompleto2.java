package c1enums;

enum CafeSizeSobrescrito {
	MEDIO(50)
	,GRANDE(100) {
		@Override
		public String getTipo() { // override the method 	
			return "A";
		}
	} //; seria obrigatorio nesse caso
	,MUITO_GRANDE(200)
	,REALMENTE_OFENSIVO(1000);
	CafeSizeSobrescrito(int mls) {
		this.mls = mls;
	}
	private int mls;
	public int getMls() {
		return mls;
	}
	public String getTipo() {
		return "B";
	}
}

public class CafeCompleto2 {
	CafeSizeSobrescrito size;
	// each instance of Coffee has a CafeSize enum
	public static void main(String[] args) {
		CafeCompleto2 cafe = new CafeCompleto2();
		cafe.size = CafeSizeSobrescrito.GRANDE;
		System.out.println("volume:"+cafe.size.getMls()+"ml\nTipo grao:"+cafe.size.getTipo());
	}

}
