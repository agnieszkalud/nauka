package algorytmy.info;

public class SortowaniePrzezWstawianie {

	public static void wydrukujTablice(int tablica[]) {
		for (int i = 0; i < tablica.length; i++) {
			System.out.print(tablica[i] + " ");
		}
		System.out.println("");
	}

	public static int[] sortowanieWstawianie(int[] tablica) {
		for (int j = tablica.length - 2; j >= 0; j--) {// wykonuje petle dopoki
														// j jest nieujemne
														// zaczynając od
														// elementu
			// rownego dlugosci tablicy pomniejszonej o 2 poniewa nie mozemy
			// zaczac
			// od ostatniego elementu
			int x = tablica[j];// przypisanie x wartosci tablicy tab[j]
			int i = j + 1; // przypisanie zmiennej i wartosc indeksu + 1

			while ((i < tablica.length) && (x > tablica[i]))// po spełnieniu
															// warunków zostaje
															// wykonywana
															// instrukcja
			{
				tablica[i - 1] = tablica[i];
				i++;// zwiekszenie indeksu 0 jeden
			}

			tablica[i - 1] = x;// wartosć i-1 elementu tablicy rowna jest x
		}
		return tablica;

	}
}
