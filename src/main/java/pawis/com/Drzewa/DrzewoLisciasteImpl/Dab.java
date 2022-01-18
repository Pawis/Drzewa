package pawis.com.Drzewa.DrzewoLisciasteImpl;

import java.util.List;

import pawis.com.Drzewa.Czesci.Galaz;
import pawis.com.Drzewa.Czesci.Pien;
import pawis.com.Drzewa.Lisciaste.DrzewoLisciaste;

public class Dab extends DrzewoLisciaste {

	public Dab(Pien pien, List<Galaz> galezie) {
		super(pien, galezie);
		// TODO Auto-generated constructor stub
	}

	private int iloscNasion;	
	
	public void produkujNasiona() {
		iloscNasion++;
	}

	public int iloscNasion() {
		return iloscNasion;
	}
	
}
