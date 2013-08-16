package algorytmy.info;

public class KolejkaListaTest {

	public static void mian(String[] args) {

		KolejkaLista kolejkaLista = new KolejkaLista();

		kolejkaLista.dodajNaKoniec("10");
		kolejkaLista.dodajNaKoniec("20");

		kolejkaLista.wyswietl();

		kolejkaLista.usunZPoczatku();

		kolejkaLista.dodajNaKoniec("30");
		kolejkaLista.dodajNaKoniec("40");

		kolejkaLista.wyswietl();

	}
	
	}


