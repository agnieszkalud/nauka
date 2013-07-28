package algorytmy.info;

/**
 * zasada FIFO (First-In-First-Out,"pierwszy wszedł, pierwszy wyszedł"),
 * analogia do kolejki przy kasie biletowej;
 * 
 */
public class Kolejka {
	private int maxRozmiar;
	private int[] kolejka;
	private int poczatek;// ang.front
	private int koniec; // ang. rear
	private int nElem;
	private int[] nowaKolejka;
	int licz;

	public Kolejka(int s) {// konstruktor
		maxRozmiar = s;
		kolejka = new int[maxRozmiar];
		poczatek = 0;
		koniec = -1;
		nElem = 0;
	}

	/**
	 * wstawia element na koniec kolejki
	 * 
	 * @param j
	 */
	public void dodaj(int j) {
		int maxBufor = maxRozmiar - 1;
		if (koniec == maxBufor) {// zawiniecie
			nowaKolejka = new int[kolejka.length + 1];
			int i;
			for (i = 0; i < kolejka.length; i++) {
				nowaKolejka[i] = kolejka[i];
			}
			nowaKolejka[i] = j;
			kolejka = nowaKolejka;
			nElem++;
			return;

		}
		kolejka[++koniec] = j;// zwiększam zmienną koniec i wstawiam element
		nElem++;// przybył element
		if (nElem > maxRozmiar) {
			nElem = maxRozmiar;
		}
	}

	/**
	 * usuwa element z początku kolejki
	 * 
	 * @return
	 */
	public void kasuj() {
		if (nElem == 0) {
			System.out.println("W kolejce nie ma elementów do usunięcia ");
			return;
		}
		// poczatek = poczatek % nElem;
		System.out.println("poczatek " + poczatek);
		if (poczatek == nElem && licz != 1) {// zmienna i zapobiega drugiemu
			// wejsciu do tego if
			poczatek = -1;
			licz++;
		}

		int tymczasowa = kolejka[++poczatek];
		kolejka[poczatek] = 0;
		// poczatek++;
		nElem--;
		System.out.println("elem " + nElem);
		System.out.println("Usunieto element " + tymczasowa);
	}

	/**
	 * metoda podejrzyj(z ang. peek)zwraca wartość z początku kolejki
	 * 
	 * @return
	 */
	public void podejrzyj() {
		if (jestPusta()) {
			System.out.println("Nie ma elementow w kolejce.");
			return;
		}
		System.out.println("Na poczatku kolejki jest " + kolejka[poczatek]);
	}

	/**
	 * zwraca true, jeśli kolejka jest pusta
	 * 
	 * @return
	 */
	public boolean jestPusta() {
		return (nElem == 0);
	}

	/**
	 * zwraca true, jesli kolejka jest pełna
	 * 
	 * @return
	 */
	public boolean jestPelna() {
		return (nElem == maxRozmiar);
	}

	/**
	 * zwracaliczbę elementów w kolejce
	 * 
	 * @return
	 */
	public int rozmiar() {
		return nElem;
	}

	/**
	 * wypisuje wszystkie elementy
	 */
	public void zobaczSklad() {
		if (jestPusta()) {
			System.out.println("Nie ma elementów w tej kolejce.");
			return;
		}
		int tymczasowa = nElem;
		while (tymczasowa != 0) {
			System.out.print(kolejka[poczatek] + " ");
			poczatek++;
			tymczasowa--;
		}
		System.out.println("");
	}

	public void usunWszystko() {
		while (!jestPusta()) {
			kasuj();
		}
	}
}
