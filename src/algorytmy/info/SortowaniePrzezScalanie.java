package algorytmy.info;

public class SortowaniePrzezScalanie {

	private static int tablica[] = { 43, 1, 6, 6, 73, 0, 121 };
	static int n = tablica.length;
	private static int tabPomocnicza[] = new int[n];

	/**
	 * 
	 * Scalanie dwoch posortowanych ciagow tab[pocz...sr] i tab[sr+1...kon] przy
	 * wykorzystaniu tablicy pomocniczej i wynik zapisuje w tab[pocz...kon]
	 */
	public static void sortowanie(int poczatek, int koniec, int srodek) {
		int i = poczatek; // wskazniki tablicy
		int j = srodek + 1; // Ustawienie wskaźników tablic
		int z = poczatek;

	/*
		 * for (i = poczatek; i <= koniec; i++) { tabPomocnicza[i] = tablica[i];
		 * // Skopiowanie danych do tablicy // pomocniczej }
		 */

		while (i <= srodek && j <= koniec) { // Przenoszenie danych z
												// sortowaniem ze zbiorów
												// pomocniczych do tablicy
												// głównej

			if (tablica[i] < tablica[j]) {
				tabPomocnicza[z] = tablica[i];
				i++;
			} else {
				tabPomocnicza[z] = tablica[j];
				j++;
			}
			z++;
		}
		/*
		 * Skonczyl sie ktorys z ciagow: tablica[pocz..sro] lub
		 * tablica[sro+1..koniec]. Nalezy ogon * drugiego ciagu przepisac do
		 * tablicy tabPomoocnicza na pozycje z+1..koniec.
		 */
		while (i <= srodek) {
			tabPomocnicza[z] = tablica[i];
			i++;
			z++;
		}
		while (j <= koniec) {
			tabPomocnicza[z] = tablica[j];
			j++;
			z++;
		}

		/*
		 * Teraz pozostaje tylko przepisac wynik-posortowany ciag z tablicy
		 * pomocniczek * do tablicy właściwej
		 */
		for (int k = poczatek; k <= koniec; k++) {
			tablica[k] = tabPomocnicza[k];
		}
	}

	/* Procedura sortowania tab[pocz...kon] */
	public static void sortowanieScalanie(int poczatek, int koniec) {

		if (poczatek < koniec) {
			int srodek = (poczatek + koniec) / 2;
			sortowanieScalanie(poczatek, srodek); // Dzielenie lewej części
			sortowanieScalanie(srodek + 1, koniec); // Dzielenie prawej części
			sortowanie(poczatek, srodek, koniec); // Łączenie części lewej i
													// prawej
		}
	}

	public static void main(String[] args) {

		System.out.println("Zbior przed sortowaniem:");
		for (int i = 0; i < n; i++)
			System.out.print(tablica[i] + " ");

		sortowanieScalanie(0, n - 1);

		System.out.println("\nZbior po sortowaniu:");

		for (int i = 0; i < n; i++)
			System.out.print(tablica[i] + " ");

	}
}
