package objekt;

public class Verbrauchbar extends Objekt {

	private enum Effekte {
		Heilen, Beschleunigen, Staerken, Zielwasser, Hasenpfote
	}

	private static int Heilen = 0;
	private static int Beschleunigen = 1;
	private static int Staerken = 2;
	private static int Zielwasser = 3;
	private static int Hasenpfote = 4;

	public Verbrauchbar(String n, String b) {
		super(n, b);
	}

}
