package objekt;

public class Stichwaffe extends Waffe {

	private enum Handguns {
		Dolch, CombatKnife, ImproSpeer, Gr�berdolch
	}

	private static int Dolch = 0;
	private static int CombatKnife = 1;
	private static int ImproSpeer = 2;
	private static int Gr�berdolch = 3;

	public Stichwaffe(String n, String b) {
		super(n, b);
	}
}
