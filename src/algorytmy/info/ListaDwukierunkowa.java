package algorytmy.info;

public class ListaDwukierunkowa {
	private ListaDwukierunkowaWezel poczatek;
	private ListaDwukierunkowaWezel koniec;

	public ListaDwukierunkowa() {
		poczatek = null;
		koniec = null;
	}

	public void wstawianieNaPoczatek(String elem) {
		ListaDwukierunkowaWezel nowy = new ListaDwukierunkowaWezel(elem, null, null);

		if (czyPusta()) {
			koniec = nowy;
		} else {
			poczatek.poprzednik = nowy;
		}
		nowy.nastepca = poczatek;
		poczatek = nowy;
	}

	public void wstawianieNaKoniec(String elem) {
		ListaDwukierunkowaWezel nowy = new ListaDwukierunkowaWezel(elem, null, null);

		if (czyPusta()) {
			poczatek = nowy;
		} else {
			koniec.nastepca = nowy;
			nowy.poprzednik = koniec;
		}
		koniec = nowy;
	}

	/*
	 * public void wstaw(String element) { ListaDwukierunkowaWezel wezel = new
	 * ListaDwukierunkowaWezel(element, null, null); if (czyPusta()) { poczatek
	 * = wezel; koniec = wezel; } else { ListaDwukierunkowaWezel pomocnicza =
	 * poczatek; while (pomocnicza != null) { if
	 * ((pomocnicza.getKlucz()).equals(element)) { pomocnicza =
	 * pomocnicza.getNastepce(); } else { if (pomocnicza == poczatek) {
	 * wezel.setNastepce(pomocnicza); pomocnicza.setPoprzednika(wezel); poczatek
	 * = wezel; break; } else { wezel.setNastepce(pomocnicza);
	 * wezel.setPoprzednika(pomocnicza.getPoprzednika());
	 * (pomocnicza.getPoprzednika()).setNastepce(wezel);
	 * pomocnicza.setPoprzednika(wezel); break; } } } if (pomocnicza == null) {
	 * koniec.setNastepce(wezel); wezel.setPoprzednika(koniec); koniec = wezel;
	 * } } }
	 */

	public void usunPierwszyElement() {
		if (czyPusta()) {
			System.out.println("Lista jest pusta");
			return;
		}
		if (poczatek.nastepca == null) {// jesli jest tylko jeden element
			koniec = null;
		} else {
			poczatek.nastepca.poprzednik = null; // poprzednio drugi element
		}
		poczatek = poczatek.nastepca;
	}

	public void usunOstatniElement() {
		if (czyPusta()) {
			System.out.println("Lista jest pusta");
			return;
		}
		if (poczatek.nastepca == null) {// jesli jest tylko jeden element
			poczatek = null;
		} else {
			koniec.poprzednik.nastepca = null; // poprzednio przedostatni
												// element-->null
		}
		koniec = koniec.poprzednik; // last--> poprzednio przedostatni
	}

	public ListaDwukierunkowaWezel usun(String element) {
		ListaDwukierunkowaWezel pomocniczy = poczatek; // zaczynam od poczatku
		while (pomocniczy.getKlucz() != element) {// dopóki nie znaleziono
													// elementu
			pomocniczy = pomocniczy.nastepca; // przechodze do nastepnego
			if (pomocniczy == null) {
				return null;// nie znaleziono elementu
			}
		}
		if (pomocniczy == poczatek) {// jeżeli znaleziony elemnt jest pierwszym
										// elementem
			poczatek = pomocniczy.nastepca; // drugi element bedzie pierwszym
		} else {// jezeli nie
			pomocniczy.poprzednik.nastepca = pomocniczy.nastepca;// poprzednik
																	// aktulalnego
																	// elementu->
																	// nastepnik
																	// aktualnego
		}
		if (pomocniczy == koniec) {// jeżeli znaleziony to ostatni element
			koniec = pomocniczy.poprzednik;// ostatim elementem będzie
											// przedostatni element
		} else {
			pomocniczy.nastepca.poprzednik = pomocniczy.poprzednik; // poprzednik
																	// aktualnego
																	// <--
																	// następnik
																	// aktualnego
		}
		System.out.println("Usunieto poprawnie " + pomocniczy);
		return pomocniczy; // zwracam usuniety elemnet
	}

	public boolean czyPusta() {
		return (poczatek == null);
	}

	public void wyswietlOdPoczatku() {
		ListaDwukierunkowaWezel pomocnicza = poczatek;
		System.out.println("Lista ułożona alfabetycznie od początku: ");
		while (pomocnicza != null) {
			System.out.print(pomocnicza.getKlucz() + "   ");
			pomocnicza = pomocnicza.getNastepce();
		}
	}

	public void wyswietlOdKonca() {
		ListaDwukierunkowaWezel pomoc = koniec;
		System.out.println("Lista ułożona alfabetycznie od końca: ");
		while (pomoc != null) {
			System.out.print(pomoc.getKlucz() + "   ");
			pomoc = pomoc.getPoprzednika();
		}
	}

	public void rozmiar() {
		ListaDwukierunkowaWezel pomoc = poczatek;
		int i = 0;
		while (pomoc != null) {
			i++;
			pomoc = pomoc.getNastepce();
		}
		System.out.println("Rozmiar listy: " + i);
	}

	public String znajdz(String elem) {
		ListaDwukierunkowaWezel pomoc = poczatek;
		while (pomoc != null) {
			if (pomoc.getKlucz().equals(elem)) {
				System.out.println("Znaleziono element " + elem);
				return elem;
			}
			pomoc = pomoc.getNastepce();
		}
		System.out.println("Nie znaleziono elementu " + elem);
		return "";
	}
}
