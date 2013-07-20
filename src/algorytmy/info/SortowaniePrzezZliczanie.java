package algorytmy.info;

public class SortowaniePrzezZliczanie {
	private static int maksymalnaLiczba;
	private static int[] tPomocnicza; // Tablica pomocnicza
	private static int c;

	public static void wydrukujTablice(int[] tablica) {
		for (int i = 0; i < tablica.length; i++) {
			System.out.print(tablica[i] + " ");
		}
		System.out.println("");
	}

	public static void sortowanieZliczanie(int[] tablica) {

		maksymalnaLiczba = tablica[0];
		for (int i = 0; i < tablica.length; i++) {
			if (tablica[i] > maksymalnaLiczba) {
				maksymalnaLiczba = tablica[i];
			}
		}
		tPomocnicza = new int[maksymalnaLiczba + 1];

		for (int i = 0; i < maksymalnaLiczba + 1; i++)
			tPomocnicza[i] = 0;// zerowanie tablicy pomocniczej
		for (int i = 0; i < tablica.length; i++)
			tPomocnicza[tablica[i]]++; // pobieranie i-tego wyrazu z tablicy i
		// zwiekszanie i-tego wyrazu tablicy pomocniczej
		c = 0;
		for (int i = 0; i < maksymalnaLiczba + 1; i++) {
			if (tPomocnicza[i] > 0)
				for (int k = 0; k < tPomocnicza[i]; k++) {// tworzenie
															// tablicy
					// wynikowej
					tablica[c] = i;
					c++;
				}
		}
	}
}
