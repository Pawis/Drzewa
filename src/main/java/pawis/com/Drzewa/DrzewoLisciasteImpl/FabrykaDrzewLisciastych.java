package pawis.com.Drzewa.DrzewoLisciasteImpl;

import java.util.ArrayList;
import java.util.List;

import pawis.com.Drzewa.Czesci.Galaz;
import pawis.com.Drzewa.Czesci.Pien;
import pawis.com.Drzewa.Lisciaste.DrzewoLisciaste;

public class FabrykaDrzewLisciastych {

	public DrzewoLisciaste stworzDrzewo(String gatunekDrzewa) {
		
		if(gatunekDrzewa == null) {
			return null;
		}
		
		if(gatunekDrzewa.equals("Dab")) {
			List<Galaz> galezie = new ArrayList<Galaz>();
			Pien pien = new Pien(1);
			return new Dab(pien,galezie);
		}
		
		return null;
	}
}
