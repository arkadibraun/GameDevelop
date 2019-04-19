package objekt;

public class Hiebwaffe extends Waffe {

	private enum Hiebe {
		Basey, Katana, Teleskop, Billiardkette
	}

	private static int Basey = 0;
	private static int Katana = 1;
	private static int Teleskop = 2;
	private static int Billiardkette = 3;

	public Hiebwaffe(String n, String b) {
		super(n, b);
	}
}
