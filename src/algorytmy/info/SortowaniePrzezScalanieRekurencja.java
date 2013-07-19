package algorytmy.info;

/**
 * Idea działania algorytmu sortowania przez scalanie polega na podzieleniu
 * tablicy na dwie części, posortowaniu każdej z nich, a następnie scaleniu obu
 * posortowanych połówek z wykorzystaniem metody z powrotem w jedną tablicę.
 * http://www.scribd.com/doc/62093568/20/Sortowanie-przez-scalanie
 * 
 */
public class SortowaniePrzezScalanieRekurencja {

	private int[] tablica; // odwołanie do tablicy
	private int nElems; // ilosć elementow w tablicy

	public SortowaniePrzezScalanieRekurencja(int tablica[]) { // konstruktor
		this.tablica = new int[tablica.length]; // stworzenie tablicy
		for (int i = 0; i < tablica.length; i++) {
			this.tablica[i] = tablica[i];
			nElems = tablica.length; // zainisjowanie parametru mówiącego o
										// długości tablicy
		}
	}

	/**
	 * wyświetlenie zawartości tablicy
	 */
	public void wydrukujTablice() {
		for (int i = 0; i < tablica.length; i++) {
			System.out.print(tablica[i] + " ");
		}
		System.out.println("");
	}

	/**
	 * metoda ta tworzy tablicę pomocniczą na potrzeby sortowania oraz wywołuje
	 * rekurencyjna metode ktora jest odpowiedzialna za posortowanie tablicy
	 */
	public void przygotowanieDoSortowania() {
		int[] tPomocnicza = new int[nElems];// obszar roboczy
		sortowanie(tPomocnicza, 0, nElems - 1);
	}

	/**
	 * metoda operuje na jednej tablicy — polu . Argumentami wywołania tej
	 * metody są liczby określające punkt początkowy dolnej połowy podtabeli,
	 * punkt początkowy górnej połowy podtabeli oraz punkt końcowy górnej połowy
	 * podtabeli. Na podstawie tych informacji metoda oblicza wielkości obu
	 * fragmentów analizowanego obszaru tabeli
	 * 
	 * @param tPomocnicza
	 * @param lowerBound
	 * @param pktKoniec
	 */
	public void sortowanie(int[] tPomocnicza, int pktPoczatek, int pktKoniec) {
		if (pktPoczatek == pktKoniec) {// jesli zawiera jeden element nie ma
										// sensu sortować
			return;
		}

		else {
			int srodek = (pktPoczatek + pktKoniec) / 2;// wyznaczenie punktu
														// środkowego
														// analizowanego zakresu
			sortowanie(tPomocnicza, pktPoczatek, srodek);// sortuje lewa polowke
			sortowanie(tPomocnicza, srodek + 1, pktKoniec);// sortuje prawa
															// polowke
			scalenie(tPomocnicza, pktPoczatek, srodek + 1, pktKoniec);// scalenie
																		// posortowanych
																		// połówek
																		// i
																		// zapis
																		// ich
																		// do
																		// tablicy
		}
	}

	/**
	 * scalenie dwóch posortowanych połówek i zapis ich do tablicy
	 * 
	 * @param tPomocnicza
	 * @param pocPtr
	 * @param konPtr
	 * @param pktKoniec
	 */
	public void scalenie(int[] tPomocnicza, int pocPtr, int konPtr, int pktKoniec) {

		int j = 0; // indeks obszaru roboczego
		int pktPoczatek = pocPtr;
		int srodek = konPtr - 1;
		int n = pktKoniec - pktPoczatek + 1; // ilosc elementow

		// petla porownuje elementy polowek i kolejno mniejsze elementy zapisuje
		// do tablicy roboczej
		while (pocPtr <= srodek && konPtr <= pktKoniec) {// żadna tablica nie
															// jest pusta(żadna
															// połówka)
			if (tablica[pocPtr] < tablica[konPtr]) {
				tPomocnicza[j] = tablica[pocPtr];
				j++;
				pocPtr++;
			} else {
				tPomocnicza[j] = tablica[konPtr];
				j++;
				konPtr++;
			}
		}
		while (pocPtr <= srodek) {// petla analizuje sytuacje gdy cala zawartosc
									// drugiej polowki jest juz w tablicy
									// roboczej, ale w pierwszej połówce są
									// jeszcze jakieś elementy
			tPomocnicza[j] = tablica[pocPtr];
			j++;
			pocPtr++;
		}
		while (konPtr <= pktKoniec) {// wszystkie elementy pierwszej połówki są
										// już s tablicy roboczej ale jeszcze
										// pozostały jakieś elementy w drugiej
										// połówce
			tPomocnicza[j] = tablica[konPtr];
			j++;
			konPtr++;
		}
		for (j = 0; j < n; j++) {
			tablica[pktPoczatek + j] = tPomocnicza[j];
		}
	}
}