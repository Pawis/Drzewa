package pawis.com.Drzewa.Iglaste;

import java.util.List;

import pawis.com.Drzewa.Czesci.Galaz;
import pawis.com.Drzewa.Czesci.Pien;

public abstract class DrzewoIglaste implements Iglaste{

	private Pien pien;
	
	private List<Galaz> galezie;
	
	public DrzewoIglaste(Pien pien, List<Galaz> galezie) {
		this.pien = pien;
		this.galezie = galezie;
	}
	
	public void rosnij() {
		pien.zwiekszGrubosc();
		galezie.add(new Galaz(5));
	}
	
	public int grubosc() {
		return pien.grubosc();
	}
	
	public int iloscLisci() {
		int iloscLisci = 0;
		for(Galaz a : galezie) {
			iloscLisci = iloscLisci + a.iloscLisci();
		}
		
		return iloscLisci;
	}
	
}
