package algorytmy.info;

public class SortowanieWyborTest {

	public static void main(String[] args) {

		int tablicaRosnaca[] = { 2, 5, 7, 11, 45, 76, 92 };
		int tablicaMalejaca[] = { 87, 45, 25, 11, 5, 2, 1 };
		int tablicaLosowa[] = { 43, 1, 6, 6, 73, 0, 121 };

		System.out.println("Przed sortownaiem tablicy z rosnącymi elementami:  ");
		SortowanieWybor.wydrukujTablice(tablicaRosnaca);
		System.out.println("Po sortowaniu rosnacym tablicy z rosnącymi elementami: ");
		SortowanieWybor.wydrukujTablice(SortowanieWybor.sotowaniePrzezWybor(tablicaRosnaca));

		System.out.println("Przed sortownaiem tablicy z malejącymi elementami:  ");
		SortowanieWybor.wydrukujTablice(tablicaMalejaca);
		System.out.println("Po sortowaniu rosnacym tablicy z malejącymi elementami: ");
		SortowanieWybor.wydrukujTablice(SortowanieWybor.sotowaniePrzezWybor(tablicaMalejaca));

		System.out.println("Przed sortownaiem tablicy z losowo ustawionymi elementami:  ");
		SortowanieWybor.wydrukujTablice(tablicaLosowa);
		System.out.println("Po sortowaniu rosnacym tablicy z losowo ustawionymi elementami: ");
		SortowanieWybor.wydrukujTablice(SortowanieWybor.sotowaniePrzezWybor(tablicaLosowa));

	}
}
