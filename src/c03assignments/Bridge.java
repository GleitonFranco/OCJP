package c03assignments;

public class Bridge {
	public enum Suits {
		CLUBS(20), DIAMONDS(20), HEARTS(30), SPADES(30){ public int getValue(int bid) { return ((bid-1)*30)+40; } }, NOTRUMP(40);
		Suits(int points) { this.points = points; }
		private int points;
		public int getValue(int bid) { return points * bid; }
	}
	public static void main(String[] args) {
		System.out.println(Suits.NOTRUMP.getValue(3));//corrigido de: System.out.println(Suits.NOTRUMP.getBIDValue(3));
		System.out.println(Suits.SPADES + " " + Suits.SPADES.points);
		System.out.println(Suits.values());
	}
}
