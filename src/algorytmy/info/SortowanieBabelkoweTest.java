package algorytmy.info;

public class SortowanieBabelkoweTest {

	public static void main(String[] args) {
		SortowanieBabelkowe wynik = new SortowanieBabelkowe(7);

		wynik.wydrukujTablice();
		wynik.sortujRosnaco();
		System.out.println("Po sortowaniu: ");
		wynik.wydrukujTablice();

		wynik.sortujMalejaco();
		System.out.println("Po sortowaniu: ");
		wynik.wydrukujTablice();
	}
}
