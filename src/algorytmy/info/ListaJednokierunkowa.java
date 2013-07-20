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
		System.out.println(poczatek);
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
}
