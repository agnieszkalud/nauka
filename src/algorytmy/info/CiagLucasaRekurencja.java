package algorytmy.info;

public class CiagLucasaRekurencja {
	private int wynik;
	private int a = 1;// wartosc poczatkowa ciagu
	private int b = 2;// wartosc poczatkowa ciagu

	CiagLucasaRekurencja(int n) {
		wynik = n;
	}

	public static int rekurencyjnaMetoda(int n) {
		if (n == 0) {
			return 2;
		} else if (n == 1) {
			return 1;
		} else {
			return rekurencyjnaMetoda(n - 1) + rekurencyjnaMetoda(n - 2);
		}
	}

	public int metodaZwykla() {
		int zwroc = 0;
		while (wynik > 1) {
			zwroc = a + b;
			b = a;
			a = zwroc;
			wynik--;
		}
		return zwroc;

	}
}
