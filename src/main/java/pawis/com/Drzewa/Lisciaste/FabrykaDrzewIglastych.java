package pawis.com.Drzewa.Lisciaste;

import java.util.ArrayList;
import java.util.List;

import pawis.com.Drzewa.Czesci.Galaz;
import pawis.com.Drzewa.Czesci.Pien;
import pawis.com.Drzewa.DrzewoIglasteImpl.Sosna;
import pawis.com.Drzewa.Iglaste.DrzewoIglaste;

public class FabrykaDrzewIglastych {

public DrzewoIglaste stworzDrzewo(String gatunekDrzewa) {
		
		if(gatunekDrzewa == null) {
			return null;
		}
		
		if(gatunekDrzewa.equalsIgnoreCase("Sosna")) {
			List<Galaz> galezie = new ArrayList<Galaz>();
			Pien pien = new Pien(1);
			return new Sosna(pien,galezie);
		}
		
		return null;
	}
}
