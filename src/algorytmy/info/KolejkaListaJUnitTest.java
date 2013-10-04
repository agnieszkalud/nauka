package algorytmy.info;

import static junit.framework.Assert.assertFalse;
import junit.framework.Assert;

import org.junit.Test;

public class KolejkaListaJUnitTest {

	@Test
	public void nowoUtworzonaKolejkaJestPusta() {

		KolejkaLista pustaKolejka = new KolejkaLista();

		Assert.assertTrue(pustaKolejka.czyPusta());
	}

	@Test
	public void kolejkaNiePowinnaBycPustaPoDodaniuDoNiej() {

		KolejkaLista pustaKolejka = new KolejkaLista();

		pustaKolejka.dodajNaKoniec("12");

		assertFalse(pustaKolejka.czyPusta());
	}
	//
	// public static void main(String[] args) {
	//
	// KolejkaLista kolejkaLista = new KolejkaLista();
	//
	// kolejkaLista.dodajNaKoniec("10");
	// kolejkaLista.dodajNaKoniec("20");
	//
	// kolejkaLista.wyswietl();
	//
	// kolejkaLista.usunZPoczatku();
	//
	// kolejkaLista.dodajNaKoniec("30");
	// kolejkaLista.dodajNaKoniec("40");
	//
	// kolejkaLista.wyswietl();
	//
	// }
	
	}


