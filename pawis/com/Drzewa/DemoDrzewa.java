package pawis.com.Drzewa;

public class DemoDrzewa {

	public static void main(String[] args) {
		
		DrzewoLisciaste drzewoLisciaste = new DrzewoLisciaste();
		DrzewoIglaste drzewoIglaste = new DrzewoIglaste();
		
		drzewoIglaste.iloscSzyszek();
		drzewoLisciaste.zrzucLiscie();
		drzewoLisciaste.rosnij(2);
		drzewoLisciaste.rosnij(2);
		drzewoLisciaste.rosnij(2);
		drzewoLisciaste.rosnij(2);
		System.out.println(drzewoLisciaste.iloscLisci());
		System.out.println(drzewoLisciaste.wysokosc());
	}
}
