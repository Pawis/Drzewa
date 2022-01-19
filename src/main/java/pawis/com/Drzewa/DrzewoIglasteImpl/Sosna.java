package pawis.com.Drzewa.DrzewoIglasteImpl;

import java.util.List;

import pawis.com.Drzewa.Czesci.Galaz;
import pawis.com.Drzewa.Czesci.Pien;
import pawis.com.Drzewa.Iglaste.DrzewoIglaste;

public class Sosna extends DrzewoIglaste {

	public Sosna(Pien pien, List<Galaz> galezie) {
		super(pien, galezie);
	}

	private int iloscSzyszek;

	public void produkujSzyszki() {
		iloscSzyszek++;
	}

	public int iloscSzyszek() {
		return iloscSzyszek;
	}

}
