package pawis.com.Drzewa;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import pawis.com.Drzewa.Czesci.Galaz;
import pawis.com.Drzewa.Czesci.Pien;
import pawis.com.Drzewa.DrzewoLisciasteImpl.Dab;

public class DabTest {

	private Dab dab;
	private Galaz galaz;
	
	@Before
	public void init() {
		Pien pien = new Pien(5);
		this.galaz = new Galaz(10);
		List<Galaz> galezie = new ArrayList<Galaz>();
		galezie.add(galaz);
		
		this.dab = new Dab(pien,galezie);
	}
	
	@Test
	public void testRosnij() {
		
		assertEquals(dab.grubosc(), 5);
		assertEquals(dab.iloscLisci(), 10);
		dab.rosnij();
		assertEquals(dab.grubosc(), 6);
		assertEquals(dab.iloscLisci(), 15);
		
	}
	
	@Test
	public void testIloscLisci() {
		assertEquals(dab.iloscLisci(), 10);
		
	}
	
	@Test
	public void testZrzucLiscie() {
		assertEquals(dab.iloscLisci(), 10);
		dab.zrzucLiscie();
		assertEquals(dab.iloscLisci(), 0);
	}
	
	@Test
	public void testGrubosc() {
		assertEquals(dab.grubosc(), 5);
	}
	
	@Test
	public void testZmienkolorLisci() {
		assertTrue(galaz.liscie().get(0).kolor().equals("zielony"));
		dab.zmienKolorLisci("czerwony");
		assertTrue(galaz.liscie().get(0).kolor().equals("czerwony"));
	}
	
	@Test
	public void testProdukujNasiona() {
		assertEquals(dab.iloscNasion(),0);
		dab.produkujNasiona();
		assertEquals(dab.iloscNasion(),1);
	}
	
	
	
	
}
