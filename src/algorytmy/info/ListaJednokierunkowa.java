package algorytmy.info;

public class ListaJednokierunkowa {

	private ListaJednokierunkowaWezel poczatek;
	private ListaJednokierunkowaWezel koniec;
	private int size;

	public ListaJednokierunkowa() {
		poczatek = null;
		koniec = null;
	}

	public void wstawNaPoczatek(String element) {
		ListaJednokierunkowaWezel wezel = new ListaJednokierunkowaWezel(element, poczatek);
		if (czyPusta()) {
			koniec = wezel;
		}
		poczatek = wezel;
		size++;
		System.out.println("Wstawiam " + poczatek);
	}

	public void dodajNaKoniec(String element) {
		ListaJednokierunkowaWezel nowyWezel = new ListaJednokierunkowaWezel(element, null);
		if (czyPusta()) {
			poczatek = nowyWezel;
		} else {
			koniec.setNastepce(nowyWezel);
		}
		koniec = nowyWezel;
		size++;
		System.out.println("Wstawiam " + koniec);
	}

	public ListaJednokierunkowaWezel usunZPoczatku() {

		if (czyPusta()) {
			size = 0;
			return null;
		} else {
			ListaJednokierunkowaWezel pomoczniczy = poczatek;
			poczatek = poczatek.getNastepce();
			size--;
			return pomoczniczy;
		}

	}

	public boolean czyPusta() { // sprawdza czy lista jest pusta
		return (poczatek == null);
	}

	public void wyswietl() {
		if (czyPusta()) {
			System.out.println("Lista jest pusta");
		}
		ListaJednokierunkowaWezel pomocniczy = poczatek;
		while (pomocniczy != null) {
			System.out.print(pomocniczy + " ");
			pomocniczy = pomocniczy.getNastepce();
		}
		System.out.println(" ");
	}

	/**
	 * Metoda zwracająca aktualny rozmiar listy
	 * 
	 * @return rozmiar listy
	 */
	public int getSize() {
		return size;
	}

	public void usunElement(String element) {
		if (znajdz(element) == "") {
			return;
		}
		if (poczatek.getKlucz().equals(element)) {
			poczatek = poczatek.getNastepce();
			size--;
			return;
		}

		if (koniec.getKlucz().equals(element)) {
			koniec = null;
			size--;
			return;
		}
		ListaJednokierunkowaWezel pomoc = poczatek;
		while (pomoc.getNastepce() != koniec) {
			if (pomoc.getNastepce().getKlucz().equals(element)) {
				pomoc.setNastepce(pomoc.getNastepce().getNastepce());
				size--;
				return;
			}
			pomoc = pomoc.getNastepce();
		}
	}

	public String znajdz(String elem) {
		ListaJednokierunkowaWezel pomoc = poczatek;
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

	public void usunWszystkie() {
		while (poczatek != null) {
			ListaJednokierunkowaWezel pomoc = poczatek;
			poczatek = pomoc.getNastepce();
			pomoc = null;
		}
		size = 0;
	}
}
