package liczbaLista1;


public class Liczba2 {

	private int liczba = 13;

	static String tablicaHex[] = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F" };

	public Liczba2(int liczba) {
		this.liczba = liczba;
	}

	private void poprawnoscLiczby(int liczba) {
		if (liczba < 0) {
			System.out.println("Niepoprawna zapis liczby.");
		}
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

	public void konwersja(int podstawa) {
		poprawnoscLiczby(liczba);
		konwersjaNaInnySystem(podstawa);

	}

	public static void main(String[] args) {

		Liczba2 liczba2 = new Liczba2(13);
		// public Liczba2() {
		for (int system = 2; system <= 16; system++) {

			System.out.println("liczba " + liczba2.liczba + " w sytemie " + system + " = " + liczba2.konwersja(system));

		}

	}
}
