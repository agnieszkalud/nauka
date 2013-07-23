package algorytmy.info;

public class ListaJednokierunkowaTest {

	public static void main(String[] args) {

		ListaJednokierunkowa lista = new ListaJednokierunkowa();

		lista.wstawNaPoczatek("Jeden");
		lista.wstawNaPoczatek("Dwa");
		lista.wstawNaPoczatek("Trzy");
		System.out.println("Rozmiar tablicy: " + lista.getSize());

		lista.znajdz("Dwa");

		lista.usunWszystkie();
		System.out.print("Wyświetlam listę: ");
		lista.wyswietl();
		System.out.println("Rozmiar tablicy: " + lista.getSize());

		lista.wstawNaPoczatek("Jeden");
		lista.wstawNaPoczatek("Dwa");
		lista.wstawNaPoczatek("Trzy");
		lista.usunZPoczatku();
		System.out.println("Rozmiar tablicy po usunieciu początkowego elementu: " + lista.getSize());

		lista.dodajNaKoniec("1");
		lista.dodajNaKoniec("2");
		lista.dodajNaKoniec("3");
		lista.dodajNaKoniec("4");
		System.out.println("Rozmiar tablicy: " + lista.getSize());

		lista.usunElement("2");
		System.out.print("Wyświetlam listę po usunieciu wybranego elementu: ");
		lista.wyswietl();
		System.out.println("Rozmiar tablicy: " + lista.getSize());
	}
}
