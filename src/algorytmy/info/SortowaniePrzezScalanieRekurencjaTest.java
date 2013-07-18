package algorytmy.info;

public class SortowaniePrzezScalanieRekurencjaTest {
	public static void main(String[] args) {
		int[] tablicaLosowa = { 43, 1, 6, 6, 73, 0, 121 };
		SortowaniePrzezScalanieRekurencja sortuj = new SortowaniePrzezScalanieRekurencja(tablicaLosowa);

		System.out.println("Przed sortownaiem tablicy:  ");
		sortuj.wydrukujTablice();
		System.out.println("Po sortowaniu rosnacym tablicy: ");
		sortuj.przygotowanieDoSortowania();
		sortuj.wydrukujTablice();
	}
}
