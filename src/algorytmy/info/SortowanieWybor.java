package algorytmy.info;

public class SortowanieWybor {

	public static void wydrukujTablice(int tablica[]) {
		for (int i = 0; i < tablica.length; i++) {
			System.out.print(tablica[i] + " ");
		}
		System.out.println("");
	}

	public static int[] sotowaniePrzezWybor(int tablica[]) {
		for (int i = 0; i < tablica.length - 1; i++) {
			int najmniejsza = i;
			for (int j = i + 1; j < tablica.length; j++) {
				if (tablica[j] < tablica[najmniejsza]) {
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
