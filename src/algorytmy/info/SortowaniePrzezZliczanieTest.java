package algorytmy.info;

public class SortowaniePrzezZliczanieTest {

	public static void main(String[] args) {

		int tablicaRosnaca[] = { 2, 5, 7, 11, 45, 76, 92 };
		int tablicaMalejaca[] = { 87, 45, 25, 11, 5, 2, 1 };
		int tablicaLosowa[] = { 43, 1, 6, 6, 73, 0, 121 };

		System.out.println("Przed sotowaniem tablicy rosnącej");
		SortowaniePrzezZliczanie.wydrukujTablice(tablicaRosnaca);
		System.out.println("Tablica po posortowaniu:");
		SortowaniePrzezZliczanie.sortowanieZliczanie(tablicaRosnaca);
		SortowaniePrzezZliczanie.wydrukujTablice(tablicaRosnaca);

		System.out.println("Przed sotowaniem tablica malejąca");
		SortowaniePrzezZliczanie.wydrukujTablice(tablicaMalejaca);
		System.out.println("Tablica po posortowaniu:");
		SortowaniePrzezZliczanie.sortowanieZliczanie(tablicaMalejaca);
		SortowaniePrzezZliczanie.wydrukujTablice(tablicaMalejaca);

		System.out.println("Przed sotowaniem tablicy z losowo ustawionymi elementami");
		SortowaniePrzezZliczanie.wydrukujTablice(tablicaLosowa);
		System.out.println("Tablica po posortowaniu:");
		SortowaniePrzezZliczanie.sortowanieZliczanie(tablicaLosowa);
		SortowaniePrzezZliczanie.wydrukujTablice(tablicaLosowa);
	}
}
