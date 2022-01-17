package pawis.com.Drzewa;

import java.util.ArrayList;
import java.util.List;

public class Drzewo {
	
	private Pien pien;
	
	private int wysokosc;

	protected List<Galaz> galezie;
	
	public Drzewo() {
		this.pien = new Pien();
		this.wysokosc = 1;
		this.galezie = new ArrayList<Galaz>();
	}
	
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
	
	public int iloscLisci() {
		
		int iloscLisci = 0;
		
		for(Galaz a : galezie) {
			iloscLisci = iloscLisci + a.iloscLisci();
		}
		
		return iloscLisci;
	}
	
	public int iloscGalezi() {
		return galezie.size();
	}	


}
