package algorytmy.info;

public class ListaJednokierunkowa {

	private ListaJednokierunkowaWezel poczatek;
	private ListaJednokierunkowaWezel koniec;

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
	}

	public ListaJednokierunkowaWezel usunZPoczatku() {

		if (czyPusta()) {
			return null;
		} else {
			ListaJednokierunkowaWezel pomoczniczy = poczatek;
			poczatek = poczatek.getNastepce();
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

}
