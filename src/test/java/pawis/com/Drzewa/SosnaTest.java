package pawis.com.Drzewa;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import pawis.com.Drzewa.Czesci.Galaz;
import pawis.com.Drzewa.Czesci.Pien;
import pawis.com.Drzewa.DrzewoIglasteImpl.Sosna;

public class SosnaTest {

	private Sosna sosna;
	
	@Before
	public void init() {
		Galaz galaz = new Galaz(10);
		List<Galaz> galezie = new ArrayList<Galaz>();
		galezie.add(galaz);
		Pien pien = new Pien(5);
		
		this.sosna =  new Sosna(pien,galezie);
	}
	
	@Test
	public void testRosnij() {
		assertEquals(sosna.grubosc(), 5);
		assertEquals(sosna.iloscLisci(), 10);
		sosna.rosnij();
		assertEquals(sosna.grubosc(), 6);
		assertEquals(sosna.iloscLisci(), 15);
	}
	
	@Test
	public void testIloscLisci() {
		assertEquals(sosna.iloscLisci(), 10);
		
	}
	

	@Test
	public void testGrubosc() {
		assertEquals(sosna.grubosc(), 5);
	}
	
	@Test
	public void testProdukujSzyski() {
		assertEquals(sosna.iloscSzyszek(),0);
		sosna.produkujSzyszki();
		assertEquals(sosna.iloscSzyszek(),1);
	}
	
}
