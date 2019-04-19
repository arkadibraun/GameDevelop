package objekt;

public class Kleinkaliber extends Schusswaffe {

	private enum Handguns {
		GLOCK, UZI, DESERT, COLT
	}

	private static int GLOCK = 0;
	private static int UZI = 1;
	private static int DESERT = 2;
	private static int COLT = 3;

	public Kleinkaliber(String n, String b, int d, int m) {
		super(n, b, d, m);
	}
}
