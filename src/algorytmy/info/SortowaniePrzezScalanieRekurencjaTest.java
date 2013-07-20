package algorytmy.info;

public class SortowaniePrzezScalanieRekurencjaTest {
	public static void main(String[] args) {

		int tablicaRosnaca[] = { 2, 5, 7, 11, 45, 76, 92 };
		int tablicaMalejaca[] = { 87, 45, 25, 11, 5, 2, 1 };
		int tablicaLosowa[] = { 43, 1, 6, 6, 73, 0, 121 };

		SortowaniePrzezScalanieRekurencja rosnaca = new SortowaniePrzezScalanieRekurencja(tablicaRosnaca);
		System.out.println("Przed sortownaiem tablicy z rosnaco ustawionymi elementami:  ");
		rosnaca.wydrukujTablice();
		System.out.println("Po sortowaniu tablicy: ");
		rosnaca.przygotowanieDoSortowania();
		rosnaca.wydrukujTablice();

		SortowaniePrzezScalanieRekurencja malejaca = new SortowaniePrzezScalanieRekurencja(tablicaMalejaca);
		System.out.println("Przed sortownaiem tablicy z malejącymi elementami:  ");
		malejaca.wydrukujTablice();
		System.out.println("Po sortowaniu tablicy: ");
		malejaca.przygotowanieDoSortowania();
		malejaca.wydrukujTablice();

		SortowaniePrzezScalanieRekurencja sortuj = new SortowaniePrzezScalanieRekurencja(tablicaLosowa);
		System.out.println("Przed sortownaiem tablicy z losowo ustawionymi elementami:  ");
		sortuj.wydrukujTablice();
		System.out.println("Po sortowaniu tablicy: ");
		sortuj.przygotowanieDoSortowania();
		sortuj.wydrukujTablice();
	}
}
