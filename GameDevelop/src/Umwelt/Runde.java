package Umwelt;

public class Runde {

	/*
	 * Runde besteht aus move und attack 
	 * zuerst player 1 dann player 2 usw.
	 * 
	 * Player hat ein bestimmtes Kontingent an movement
	 * man kann also move-attack
	 * move-attack-move
	 * oder attack-move
	 * 
	 * bzgl Kollision wird sich später was ergeben
	 * ein attack sieht so aus
	 * 
	 * es wird berechneTrefferChacne() aufgerufen und dann geschaut 
	 * in welchem bereich die zahl ist zzgl bonus.
	 * 
	 * alles >=0 ist kritischer misserfolg mann nimmst selbst schaden
	 * 0<n<=9 kein treffer ohne nenbenwirkung
	 * 9<n<=18 treffer ohne bonus
	 * der rest ist krit.Treffer mit doppelt dmg
	 *
	 *  
	 * 
	 */
	
	private int roundcounter;
	
	
	
	
	
	
}
