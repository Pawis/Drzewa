package pawis.com.Drzewa.Lisciaste;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import pawis.com.Drzewa.Czesci.Galaz;
import pawis.com.Drzewa.Czesci.Pien;

public abstract class DrzewoLisciaste implements Lisciaste {

	private final Pien pien;

	private final List<Galaz> galezie;
	
	protected static final Logger logger = LogManager.getLogger(DrzewoLisciaste.class);

	public DrzewoLisciaste(Pien pien, List<Galaz> galezie) {
		this.pien = pien;
		this.galezie = galezie;
	}

	public void rosnij() {
		pien.zwiekszGrubosc();
		galezie.add(new Galaz(5));
	}

	public void zrzucLiscie() {
		for (Galaz a : galezie) {
			a.liscie().clear();
		}
	}

	public int grubosc() {
		return pien.grubosc();
	}

	public int iloscLisci() {
		int iloscLisci = 0;
		for (Galaz a : galezie) {
			iloscLisci = iloscLisci + a.iloscLisci();
		}

		return iloscLisci;
	}

	public void zmienKolorLisci(String kolor) {

		for (Galaz a : galezie) {
			for (int i = 0; i < a.liscie().size(); i++) {
				a.liscie().get(i).zmienKolor(kolor);
			}
		}
	}
}
