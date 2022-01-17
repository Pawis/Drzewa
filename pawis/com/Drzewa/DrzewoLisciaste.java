package pawis.com.Drzewa;

public class DrzewoLisciaste extends Drzewo implements Lisciaste {

	
	public void zrzucLiscie() {
		if(galezie != null)
		super.galezie.clear();
	}
	
	public void zmienKolorLisci(String kolor) {
		
		for(Galaz a : galezie) {
			for (int i = 0; i < a.liscie().size(); i++) {
				a.liscie().get(i).zmienKolor(kolor);
			}
		}
	}

}
