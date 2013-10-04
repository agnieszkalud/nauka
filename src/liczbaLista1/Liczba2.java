package liczbaLista1;


public class Liczba2 {

	private int liczba;

	static String tablicaHex[] = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F" };

	public Liczba2(int liczba) {
		this.liczba = liczba;
	}

	public int poprawnoscLiczby(int liczba) {
		if (liczba < 0) {
			System.out.println("Niepoprawna zapis liczby.");
			return 0;
		}
		return 1;
	}

	public String konwersjaNaInnySystem(int podstawa) {
		String liczbaHex = "";
		int dana = liczba;
		while (dana > 0) {
			liczbaHex = tablicaHex[dana % podstawa] + liczbaHex;
			dana = dana / podstawa;
		}
		return liczbaHex;
	}

	public String konwersja(int podstawa) {
		poprawnoscLiczby(liczba);
		return konwersjaNaInnySystem(podstawa);

	}

	public static void main(String[] args) {

		int argument = 13;
		Liczba2 liczba2 = new Liczba2(argument);
		// public Liczba2() {
		for (int system = 2; system <= 16; system++) {

			System.out.println("liczba " + argument + " w sytemie " + system + " = " + liczba2.konwersja(system));

		}

	}
}
