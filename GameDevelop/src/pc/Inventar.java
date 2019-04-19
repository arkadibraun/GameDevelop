package pc;

import objekt.*;
import java.util.*;

public class Inventar {

	ArrayList<Objekt> inventar = new ArrayList<Objekt>();
	Iterator<Objekt> iter = inventar.iterator();

	public boolean addInventar(Objekt o) {
		if (inventar.isEmpty() || inventar.size() <= 15) {
			inventar.add(o);
			return true;
		}

		else
			System.out.println("Inventory ist Full BoooI!!");
		return false;
	}

	public void showInventar() {
		// Iterator einbinden
	}

	public boolean rmvInventar() {
		return true;
	}

}
