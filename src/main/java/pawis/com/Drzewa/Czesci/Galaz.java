package pawis.com.Drzewa.Czesci;

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


	public void setLiscie(List<Lisc> liscie) {
		this.liscie = liscie;
	}


	public int iloscLisci() {
		return liscie.size();
	}
	
	public List<Lisc> liscie(){
		return liscie;
	}
	

}
