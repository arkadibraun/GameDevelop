package objekt;

public class Stichwaffe extends Waffe {

	private enum Handguns {
		Dolch, CombatKnife, ImproSpeer, Gräberdolch
	}

	private static int Dolch = 0;
	private static int CombatKnife = 1;
	private static int ImproSpeer = 2;
	private static int Gräberdolch = 3;

	public Stichwaffe(String n, String b) {
		super(n, b);
	}
}
