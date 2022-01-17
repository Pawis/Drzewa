package pawis.com.Drzewa;

import java.util.List;

public class Drzewo {
	
	protected Pien pien;
	
	protected int wysokosc;

	protected List<Galaz> galezie;
	
	public void rosnij(int iloscLisci) {
		pien.zwiekszGrubosc();
		wysokosc++;
		galezie.add(new Galaz(iloscLisci));
	}
	
	public int wysokosc() {
		return wysokosc;
	}
	
	public int grubosc() {
		return pien.grubosc();
	}
	
	public List<Galaz> galezie() {
		return galezie;
	}
	
	public int iloscLisci() {
		
		int iloscLisci = 0;
		
		for(Galaz a : galezie) {
			iloscLisci = iloscLisci + a.iloscLisci();
		}
		
		return iloscLisci;
	}

}
