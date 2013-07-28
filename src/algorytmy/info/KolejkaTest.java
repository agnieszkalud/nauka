package algorytmy.info;

public class KolejkaTest {

	public static void main(String[] args) {
		Kolejka kolejka = new Kolejka(5); // kolejka piecioelementowa

		kolejka.jestPusta();

		kolejka.dodaj(10);// jesli jest podane więcej elementów niż na poczatku
							// zadeklarowalismy to te nowe elementy sa
							// zastepowane tymi starymi poczawszy od poczatku w
							// tablicy
		kolejka.dodaj(20);
		kolejka.dodaj(30);
		kolejka.zobaczSklad();
		kolejka.dodaj(40);
		kolejka.dodaj(50);
		kolejka.dodaj(60);
		kolejka.dodaj(70);
		System.out.println("Rozmiar kolejki to " + kolejka.rozmiar());
		kolejka.zobaczSklad();

		kolejka.jestPelna();

		kolejka.kasuj();
		kolejka.kasuj();
		kolejka.kasuj();
		kolejka.dodaj(50);
		kolejka.dodaj(60);
		kolejka.kasuj();
		kolejka.kasuj();
		kolejka.kasuj();
		kolejka.kasuj();
		kolejka.kasuj();
		kolejka.kasuj();
		kolejka.zobaczSklad();

		kolejka.podejrzyj();

		// kolejka.dodaj(50);
		// kolejka.dodaj(60);
		kolejka.dodaj(70);
		kolejka.dodaj(80);

		System.out.println("Rozmiar kolejki to " + kolejka.rozmiar());

		kolejka.zobaczSklad();


	}
}
