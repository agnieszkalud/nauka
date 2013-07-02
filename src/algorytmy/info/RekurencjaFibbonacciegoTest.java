package algorytmy.info;

public class RekurencjaFibbonacciegoTest {

	public static void main(String[] args) {
		/**
		 * metoda rekurencyjna wysypuje się przy 45 i większej liczbie
		 */
		int wynik = RekurencjaFibbonacciego.rekurencjaFibbonacciego(5);
		System.out.println("Wartość ciągu Fibbonacciego dla liczby 5 wynosi " + wynik);
		/**
		 * metoda ta (nie rekurencyjna) działa nawet przy 1147000600 następnie
		 * gdzieś tam od pewnego momentu zwaraca wartości ujemne a póżniej przy
		 * jeszcze większej liczbie zwraca błąd
		 */
		int wynik2 = RekurencjaFibbonacciego2.rekurencjaFibbonacciego2(1147000600);
		System.out.println("Wartość ciągu Fibbonacciego dla liczby 5 wynosi " + wynik2);
	}
}
