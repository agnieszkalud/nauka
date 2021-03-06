package algorytmy.info;

public class SortowanieBabelkoweTest {

	public static void main(String[] args) {

		int tablicaRosnaca[] = { 2, 5, 7, 11, 45, 76, 92 };
		int tablicaMalejaca[] = { 87, 45, 25, 11, 5, 2, 1 };
		int tablicaLosowa[] = { 43, 1, 6, 6, 73, 0, 121 };

		// int wynik[] = SortowanieBabelkowe.sortujRosnaco(tablicaRosnaca);
		System.out.println("Przed sortownaiem tablicy z rosnącymi elementami:  ");
		SortowanieBabelkowe.wydrukujTablice(tablicaRosnaca);
		System.out.println("Po sortowaniu rosnacym tablicy z rosnącymi elementami: ");
		// SortowanieBabelkowe.wydrukujTablice(SortowanieBabelkowe.sortujRosnaco(tablicaRosnaca));
		SortowanieBabelkowe.sortujRosnaco(tablicaRosnaca);
		SortowanieBabelkowe.wydrukujTablice(tablicaRosnaca);
		System.out.println("Po sortowaniu malejacym tablicy z rosnącymi elementami: ");
		SortowanieBabelkowe.sortujMalejaco(tablicaRosnaca);
		SortowanieBabelkowe.wydrukujTablice(tablicaRosnaca);

		System.out.println("Przed sortownaiem tablicy z malejącymi elementami:  ");
		SortowanieBabelkowe.wydrukujTablice(tablicaMalejaca);
		System.out.println("Po sortowaniu rosnacym tablicy z malejącymi elementami: ");
		SortowanieBabelkowe.sortujRosnaco(tablicaMalejaca);
		SortowanieBabelkowe.wydrukujTablice(tablicaMalejaca);
		System.out.println("Po sortowaniu malejacym tablicy z malejącymi elementami: ");
		SortowanieBabelkowe.sortujMalejaco(tablicaMalejaca);
		SortowanieBabelkowe.wydrukujTablice(tablicaMalejaca);

		System.out.println("Przed sortownaiem tablicy z losowo ustawionymi elementami:  ");
		SortowanieBabelkowe.wydrukujTablice(tablicaLosowa);
		System.out.println("Po sortowaniu rosnacym tablicy z losowo ustawionymi elementami: ");
		SortowanieBabelkowe.sortujRosnaco(tablicaLosowa);
		SortowanieBabelkowe.wydrukujTablice(tablicaLosowa);
		System.out.println("Po sortowaniu malejacym tablicy z losowo ustawionymi elementami: ");
		SortowanieBabelkowe.sortujMalejaco(tablicaLosowa);
		SortowanieBabelkowe.wydrukujTablice(tablicaLosowa);
	}
}
