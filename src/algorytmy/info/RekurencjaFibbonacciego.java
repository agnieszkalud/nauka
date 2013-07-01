package algorytmy.info;

public class RekurencjaFibbonacciego {

	public static int rekurencjaFibbonacciego(int n) {
		if (n <= 2) {
			return 1;
		} else {

			return rekurencjaFibbonacciego(n - 2) + rekurencjaFibbonacciego(n - 1);
		}
	}
}

