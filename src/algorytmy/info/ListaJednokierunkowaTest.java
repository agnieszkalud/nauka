package algorytmy.info;

public class ListaJednokierunkowaTest {

	public static void main(String[] args) {

		ListaJednokierunkowa lista = new ListaJednokierunkowa();

		lista.wstawNaPoczatek("Jeden");
		lista.wstawNaPoczatek("Dwa");
		lista.wstawNaPoczatek("Trzy");

		System.out.print("Wyświetlam listę: ");
		lista.wyswietl();

		lista.usunZPoczatku();
		lista.dodajNaKoniec("1");
		lista.dodajNaKoniec("2");
		lista.dodajNaKoniec("3");

		System.out.print("Wyświetlam listę: ");
		lista.wyswietl();

	}
}
