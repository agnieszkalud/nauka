package liczbaLista1;

public class Liczba {

	private int liczba;

	static String tablicaHex[] = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F" };

	public Liczba(int liczba) {
		this.liczba = 13;
		konwersja(liczba);
	}

	public void poprawnoscLiczby(int liczba) throws LiczbaException {
		if (liczba < 0) {
			throw new LiczbaException(" Nieprawidlowa liczba");
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

	public void konwersja(int liczba) {
		try {
			poprawnoscLiczby(liczba);

			for (int system = 2; system <= 16; system++) {

				System.out.println("liczba " + liczba + " w sytemie " + system + " = " + konwersjaNaInnySystem(system));
			}
		} catch (LiczbaException e) {
			System.out.println(e.getMessage());
		}

	}
}
