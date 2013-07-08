package algorytmy.info;

public class SortowaniePrzezWstawianie {

	public static void wydrukujTablice(int tablica[]) {
		for (int i = 0; i < tablica.length; i++) {
			System.out.print(tablica[i] + " ");
		}
		System.out.println("");
	}

	public static int[] sortowanieWstawianie(int[] tablica) {
		for (int j = tablica.length - 2; j >= 0; j--) {
			int x = tablica[j];
			int i = j + 1;

			while ((i < tablica.length) && (x > tablica[i]))
			{
				tablica[i - 1] = tablica[i];
				i++;
			}

			tablica[i - 1] = x;
		}
		return tablica;

	}
}
