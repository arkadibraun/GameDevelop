package objekt;

public class Laser extends Schusswaffe {

	private enum Lazeer {
		Festkörper, Dioden, Gas, Farbstoff
	}

	private static int Festkörper = 0;
	private static int Dioden = 1;
	private static int Gas = 2;
	private static int Farbstoff = 3;

	public Laser(String n, String b) {
		super(n, b);
	}
}
