package pc;

import java.util.Random;

public class Player {

	private String name;
	private int point;		//Punkte zum Vergeben für Skills
	private int hp;			//Health-Points Lebenspunkte
	private int str;		//Stärke
	private int dmg;		//Schaden den man macht + HP Bonus 
	private int dex;		//Geschicklichkeit
	private int mov;		//Steps die man auf dem Array machen kann
	private int exp;		//EXP die man hat
	private int neededexp;	//EXP die man braucht
	private int lvl;		//Aktuelles Level
	private int dif;		//Easy, Normal, Hard
	
	public int berechneDMG(int str) {
		return 1;
	}
	
	public int berechneMOV(int dex) {
		return 1;
	}
	
	public void addEXP(int exp) {
		
	}
	
	
	public void lvlUP() {
		
	}
	
	public void trefer() {
		
	}
	
	public int berechneTrefferChance() {
		
		  Random a = new Random();
		  int zz = a.nextInt(19); // erstellt zufalls zwischen 0 und 19
		  
		  return zz;
		  
		  
		
		
	}
	
	
	
	
}
