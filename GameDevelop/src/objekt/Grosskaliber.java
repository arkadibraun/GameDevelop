package objekt;

public class Grosskaliber extends Schusswaffe {

	private enum Rifle {
		AK, M249, MK14, M85
	}

	private static int AK = 0;
	private static int M249 = 1;
	private static int MK14 = 2;
	private static int M85 = 3;

	public Grosskaliber(String n, String b, int d, int m) {
		super(n, b, d, m);
	}
}
