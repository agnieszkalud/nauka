package algorytmy.info;

public class SortowanieWybor {

	public static void wydrukujTablice(int tablica[]) {
		for (int i = 0; i < tablica.length; i++) {
			System.out.print(tablica[i] + " ");
		}
		System.out.println("");
	}

	/**
	 * Najpierw szukamy w zbiorze elementu najmniejszego. Gdy zostanie
	 * znaleziony, wymieniamy go z pierwszym elementem zbioru. Nastepnie zbiór
	 * pomniejszamy o ten pierwszy element, który ustawiony został już na
	 * własciwej pozycji. Krok ten powtarzamy w sposób analogiczny dla
	 * pozostałych elemntów.
	 * 
	 * @param tablica
	 * @return
	 */
	public static int[] sotowaniePrzezWybor(int tablica[]) {
		for (int i = 0; i < tablica.length - 1; i++) {
			int najmniejsza = i;
			for (int j = i + 1; j < tablica.length; j++) {// Szukanie indeksu
															// min. elementu
				if (tablica[j] < tablica[najmniejsza]) {// porownanie dwoch
														// elementow tablicy
					najmniejsza = j;
				}
			}
			int pomocnicza = tablica[najmniejsza];
			tablica[najmniejsza] = tablica[i];
			tablica[i] = pomocnicza;
		}
		return tablica;
	}
}
