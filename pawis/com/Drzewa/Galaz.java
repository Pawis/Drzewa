package pawis.com.Drzewa;

import java.util.ArrayList;
import java.util.List;

public class Galaz {

	private List<Lisc> liscie;

	public Galaz(int iloscLisci) {
		this.liscie = new ArrayList<Lisc>();
		for (int i = 0; i < iloscLisci; i++) {
			liscie.add(new Lisc());
		}
	}

	public void dodajLiscie() {
		liscie.add(new Lisc());
	}

	public int iloscLisci() {
		return liscie.size();
	}
	
	public List<Lisc> liscie(){
		return liscie;
	}

}
