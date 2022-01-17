package pawis.com.Drzewa;


public class DrzewoIglaste extends Drzewo implements Iglaste{

	private int iloscSzyszek;
	
	public void produkujSzyszki() {
		iloscSzyszek++;
		
	}

	public int iloscSzyszek() {
		return iloscSzyszek;
	}
}
