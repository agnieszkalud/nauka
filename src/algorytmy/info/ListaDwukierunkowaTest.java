package algorytmy.info;

public class ListaDwukierunkowaTest {

	public static void main(String[] args) {

		ListaDwukierunkowa lista = new ListaDwukierunkowa();

		lista.wstawianieNaPoczatek("Jeden");
		lista.wstawianieNaPoczatek("Dwa");
		lista.wstawianieNaPoczatek("Trzy");
		lista.rozmiar();

		// lista.znajdz("Dwa");

		lista.usunOstatniElement();
		lista.wyswietlOdPoczatku();
		lista.rozmiar();

		lista.wstawianieNaPoczatek("Jeden");
		lista.wstawianieNaPoczatek("Dwa");
		lista.wstawianieNaPoczatek("Trzy");
		lista.usunPierwszyElement();
		lista.rozmiar();

		lista.wstawianieNaKoniec("1");
		lista.wstawianieNaKoniec("2");
		lista.wstawianieNaKoniec("3");
		lista.wstawianieNaKoniec("4");
		lista.rozmiar();

		lista.usun("2");
		lista.wyswietlOdPoczatku();
		lista.rozmiar();
	}
}
