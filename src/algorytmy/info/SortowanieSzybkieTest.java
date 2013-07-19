package algorytmy.info;

public class SortowanieSzybkieTest {

	public static void main(String[] args) {

		int tablicaRosnaca[] = { 2, 5, 7, 11, 45, 76, 92 };
		int tablicaMalejaca[] = { 87, 45, 25, 11, 5, 2, 1 };
		int tablicaLosowa[] = { 43, 1, 6, 6, 73, 0, 121 };

		System.out.println("Przed sotowaniem");
		SortowanieSzybkie.wydrukujTablice(tablicaRosnaca);
		System.out.println("Po sortowaniu rosnacym tablicy z rosnącymi elementami: ");
		SortowanieSzybkie.quicksort(tablicaRosnaca, 0, tablicaRosnaca.length - 1);
		SortowanieSzybkie.wydrukujTablice(tablicaRosnaca);

		System.out.println("Przed sortownaiem tablicy z malejącymi elementami:  ");
		SortowanieSzybkie.wydrukujTablice(tablicaMalejaca);
		System.out.println("Po sortowaniu rosnacym tablicy z malejącymi elementami: ");
		SortowanieSzybkie.quicksort(tablicaMalejaca, 0, tablicaMalejaca.length - 1);
		SortowanieSzybkie.wydrukujTablice(tablicaRosnaca);

		System.out.println("Przed sortownaiem tablicy z losowo ustawionymi elementami:  ");
		SortowanieSzybkie.wydrukujTablice(tablicaLosowa);
		System.out.println("Po sortowaniu rosnacym tablicy z losowo ustawionymi elementami: ");
		SortowanieSzybkie.quicksort(tablicaLosowa, 0, tablicaLosowa.length - 1);
		SortowanieSzybkie.wydrukujTablice(tablicaRosnaca);

	}
}
