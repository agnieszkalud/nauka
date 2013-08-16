package algorytmy.info;

public class KolejkaLista {

	private ListaJednokierunkowa kolejka;

	/**
	 * konstruktor tworzy listę dwustronną za pomocą utworzonej już wcześniej
	 * listy jednokierunkowej
	 */
	public KolejkaLista() {
		kolejka = new ListaJednokierunkowa();
	}

	public boolean czyPusta() { // sprawdza czy kolejka jest pusta
		return kolejka.czyPusta();
	}

	public void dodajNaKoniec(String element) {// wstawianie(na koniec kolejki)
		kolejka.dodajNaKoniec(element);
	}

	public ListaJednokierunkowaWezel usunZPoczatku() {// usunięcie z początku
														// kolejki
		return kolejka.usunZPoczatku();
	}

	public void usunWszystkie() {// usunięcie wszystkich elementow z kolejki
		kolejka.usunWszystkie();
	}

	public int getSize() {// rozmiar kolejki
		return kolejka.getSize();
	}

	public void wyswietl() {// wyświetlenie zawartości kolejki
		kolejka.wyswietl();
	}
	}

