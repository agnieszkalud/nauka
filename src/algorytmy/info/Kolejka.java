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
		if (koniec == maxRozmiar - 1) {// zawiniecie
			koniec = -1;
		}
		kolejka[++koniec] = j;// zwiększam zmienną koniec i wstawiam element
		nElem++;// przybył element
	}

	/**
	 * usuwa element z początku kolejki
	 * 
	 * @return
	 */
	public int kasuj() {
		int tymczasowa = kolejka[poczatek++]; // pobieram element i zwiekszam
												// zmiennna poczatek
		if (poczatek == maxRozmiar) {// zawinięcie
			poczatek = 0;
		}
		nElem--;
		return tymczasowa;
	}

	/**
	 * metoda podejrzyj(z ang. peek)zwraca wartość z początku kolejki
	 * 
	 * @return
	 */
	public int podejrzyj() {
		return kolejka[poczatek];
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
		while (nElem != 0) {
			System.out.print(kolejka[poczatek] + " ");
			poczatek++;
			if (poczatek == maxRozmiar) {
				poczatek = 0;
			}
			nElem--;
		}
		System.out.println("");
	}

	public void usunWszystko() {
		while (!jestPusta()) {
			kasuj();
		}
	}
}

