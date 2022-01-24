package pawis.com.Drzewa.Lisciaste;

import java.util.ArrayList;
import java.util.List;

import pawis.com.Drzewa.Czesci.Galaz;
import pawis.com.Drzewa.Czesci.Pien;
import pawis.com.Drzewa.DrzewoLisciasteImpl.Dab;

public class FabrykaDrzewLisciastych {

	public DrzewoLisciaste stworzDrzewo(String gatunekDrzewa) {
		
		if(gatunekDrzewa == null) {
			return null;
		}
		
		if(gatunekDrzewa.equalsIgnoreCase("Dab")) {
			List<Galaz> galezie = new ArrayList<Galaz>();
			Pien pien = new Pien(1);
			return new Dab(pien,galezie);
		}
		
		return null;
	}
}
