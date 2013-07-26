package algorytmy.info;

public class KolejkaTest {

	public static void main(String[] args) {
		Kolejka kolejka = new Kolejka(5); // kolejka piecioelementowa

		kolejka.jestPusta();

		kolejka.dodaj(10);
		kolejka.dodaj(20);
		kolejka.dodaj(30);
		kolejka.dodaj(40);

		kolejka.jestPelna();

		kolejka.kasuj();
		kolejka.kasuj();
		kolejka.kasuj();

		System.out.println("Na poczatku kolejki jest " + kolejka.podejrzyj());

		kolejka.dodaj(50);
		kolejka.dodaj(60);
		kolejka.dodaj(70);
		kolejka.dodaj(80);

		System.out.println("Rozmiar kolejki to " + kolejka.rozmiar());

		kolejka.zobaczSklad();


	}
}
