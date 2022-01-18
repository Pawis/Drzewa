package pawis.com.Drzewa.Iglaste;

import java.util.ArrayList;
import java.util.List;

import pawis.com.Drzewa.Czesci.Galaz;
import pawis.com.Drzewa.Czesci.Pien;

public abstract class DrzewoIglaste implements Iglaste{

	private Pien pien;
	
	private List<Galaz> galezie;
	
	public DrzewoIglaste() {
		this.pien = new Pien(0);
		this.galezie = new ArrayList<Galaz>();
	}
	
	public void rosnij() {
		pien.zwiekszGrubosc();
		galezie.add(new Galaz(5));
	}
	
	public int grubosc() {
		return pien.grubosc();
	}
	
}
