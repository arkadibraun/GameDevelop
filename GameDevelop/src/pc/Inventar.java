package pc;

import objekt.Objekt;
import java.util.*;

public class Inventar {

	ArrayList<Objekt> inventar = new ArrayList<Objekt>();

	public boolean addInventar(Objekt o) {
		if (inventar.isEmpty() || inventar.size() <= 15) {
			inventar.add(o);
			return true;
		}

		else
			return false;
	}
	
	public void showInventar() {
		//Iterator einbinden
	}

	public boolean rmvInventar() {
		return true;
	}

}
