package pc;

import java.util.Random;

public class Player {

	private String name;
	private int point; // Punkte zum Vergeben für Skills
	private int hp; // Health-Points Lebenspunkte
	private int str; // Stärke
	private int dmg; // Schaden den man macht + HP Bonus
	private int dex; // Geschicklichkeit
	private int mov; // Steps die man auf dem Array machen kann
	private int exp; // EXP die man hat
	private int neededexp; // EXP die man braucht
	private int lvl; // Aktuelles Level
	private int dif; // Easy, Normal, Hard

	public Player(String name, int dif) {
		this.name = name;
		this.dif = dif;
		this.point = 10 * dif;
		this.hp = 0;
		this.dex = 0;
		this.str = 0;
		this.exp = 0;
		this.lvl = 0;
		this.neededexp = 10;

	}

	public int berechneDMG(int str) {
		int dmg;
		dmg = str / 2;
		this.dmg = dmg;
		return dmg;
	}

	public int berechneMOV(int dex) {
		int mov;
		mov = dex / 2;
		this.mov = mov;
		return mov;
	}

	public void addEXP(int exp) {
		this.exp = this.exp + exp;
		this.neededexp = this.neededexp - exp;
	}

	public void lvlUP() {
		// if neededexp = 0 pipapo
		// lvl++;
	}

	public void treffer() {

	}

	public int berechneTrefferChance() {

		Random a = new Random();
		int zz = a.nextInt(19); // erstellt zufalls zwischen 0 und 19

		return zz;

	}

}
