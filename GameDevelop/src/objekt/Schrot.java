package objekt;

public class Schrot extends Schusswaffe {

	private enum Shotguns {
		ABGESAEGT, SCHWER, DOPPELLAUF, ZWOELFG
	}

	private static int ABGESAEGT = 0;
	private static int SCHWER = 1;
	private static int DOPPELLAUF = 2;
	private static int ZWOELFG = 3;

	public Schrot(String n, String b) {
		super(n, b);
	}
}
