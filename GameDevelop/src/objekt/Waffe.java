package objekt;

public class Waffe extends Objekt{

	private int dmgbonus;
	private int movebonus;
	
	
	public Waffe(String n, String b, int d, int m) {
		super(n,b);
		this.dmgbonus = d;
		this.movebonus = m;
	}
	
	
}
