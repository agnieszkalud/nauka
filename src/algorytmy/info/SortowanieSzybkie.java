package algorytmy.info;

public class SortowanieSzybkie {

	public static void wydrukujTablice(int tablica[]) {
		for (int i = 0; i < tablica.length; i++) {
			System.out.print(tablica[i] + " ");
		}
		System.out.println("");
	}

	/**
	 * // metoda dzieli tablicę (od indeksu x do indeksu y) na dwie części // -
	 * elementy mniejsze od wybranego elementu // - elementy większe od
	 * wybranego elementu
	 */
	static void quicksort(int tablica[], int x, int y) {

		int temp;
		int i = x;
		int j = y;
		int v = tablica[(x + y) / 2];// srodek

		do {
			while (tablica[i] < v)
				i++;
			while (v < tablica[j])
				j--;
			if (i <= j) {// wyszukuje kolejne elementy większe i mniejsze od
				// elementu dzielącego (zmienna element)
				temp = tablica[i];
				tablica[i] = tablica[j];
				tablica[j] = temp;
				i++;
				j--;
			}
		} while (i <= j);
		if (x < j)
			quicksort(tablica, x, j);
		if (i < y)
			quicksort(tablica, i, y);
	}
}
