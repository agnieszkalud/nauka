package algorytmy.info;

public class SortowaniePrzezWstawianieTest {

	public static void main(String[] args) {

		int tablicaRosnaca[] = { 2, 5, 7, 11, 45, 76, 92 };
		int tablicaMalejaca[] = { 87, 45, 25, 11, 5, 2, 1 };
		int tablicaLosowa[] = { 43, 1, 6, 6, 73, 0, 121 };

		System.out.println("Przed sotowaniem");
		SortowaniePrzezWstawianie.wydrukujTablice(tablicaRosnaca);
		System.out.println("Po sortowaniu rosnacym tablicy z rosnącymi elementami: ");
		SortowaniePrzezWstawianie.wydrukujTablice(SortowaniePrzezWstawianie.sortowanieWstawianie(tablicaRosnaca));

		System.out.println("Przed sortownaiem tablicy z malejącymi elementami:  ");
		SortowaniePrzezWstawianie.wydrukujTablice(tablicaMalejaca);
		System.out.println("Po sortowaniu rosnacym tablicy z malejącymi elementami: ");
		SortowaniePrzezWstawianie.wydrukujTablice(SortowaniePrzezWstawianie.sortowanieWstawianie(tablicaMalejaca));

		System.out.println("Przed sortownaiem tablicy z losowo ustawionymi elementami:  ");
		SortowaniePrzezWstawianie.wydrukujTablice(tablicaLosowa);
		System.out.println("Po sortowaniu rosnacym tablicy z losowo ustawionymi elementami: ");
		SortowaniePrzezWstawianie.wydrukujTablice(SortowaniePrzezWstawianie.sortowanieWstawianie(tablicaLosowa));

	}
}
