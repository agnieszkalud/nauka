package algorytmy.info;

public class RekurencjaFibbonacciego2 {
	public static int rekurencjaFibbonacciego2(int n) {
		if (n == 2 || n == 1) {
			return 1;
		} else {
			int a = 0;
			int b = 1;
			int wynik = 0;
			while (n > 1) {
				wynik = a + b;
				a = b;
				b = wynik;
				n--;
			}
			return wynik;
		}
	}
}
