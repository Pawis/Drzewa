package pawis.com.Drzewa.DrzewoIglasteImpl;

import pawis.com.Drzewa.Iglaste.DrzewoIglaste;

public class Sosna extends DrzewoIglaste {

	private int iloscSzyszek;

	public void produkujSzyszki() {
		iloscSzyszek++;
	}

	public int iloscSzyszek() {
		return iloscSzyszek;
	}

}
