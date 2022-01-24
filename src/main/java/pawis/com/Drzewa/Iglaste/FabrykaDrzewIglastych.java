package pawis.com.Drzewa.Iglaste;

import java.util.ArrayList;
import java.util.List;

import pawis.com.Drzewa.Czesci.Galaz;
import pawis.com.Drzewa.Czesci.Pien;
import pawis.com.Drzewa.DrzewoIglasteImpl.Sosna;

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
