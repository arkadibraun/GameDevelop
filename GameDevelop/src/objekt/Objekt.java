package objekt;

public class Objekt {

	private int ID;
	private int IDcounter=0;
	private String name;
	private String beschreibung;

	// Objekt
	// Waffe
	// Stichwaffe, Schusswaffe
	// Klein, Gross Kabliber, Schrot, Laser

	public Objekt(String n, String b) {
		this.name = n;
		this.beschreibung = b;
		this.ID = IDcounter;
		
		IDcounter++;

	}

	public void Beschreibung() {
		// SYSO von besch.
		System.out.println("bla bla bla");

	}

}
