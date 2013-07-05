package algorytmy.info;

public class RekurencjaFibbonacciegoTest {

	public static void main(String[] args) {
		/**
		 * metoda rekurencyjna od 47 zwrca liczbę ujemną
		 */
		int wynik = RekurencjaFibbonacciego.rekurencjaFibbonacciego(5);
		System.out.println("Wartość ciągu Fibbonacciego dla liczby 5 wynosi " + wynik);
		/**
		 * foramlnie zakres int wynosi −2 147 483 648 — +2 147 483 647 (ze
		 * znakiem, w tym programie przy 2 147 483 646 wynikami są już ujemne
		 * warotości, natomiast przy 2147483648 i większej liczbie następuje
		 * wyjątek związany z przekroczeniem zakresu:
		 * "The literal 2147483648 of type int is out of range"
		 */
		int wynik2 = RekurencjaFibbonacciego2.rekurencjaFibbonacciego2(214);
		System.out.println("Wartość ciągu Fibbonacciego dla liczby 5 wynosi " + wynik2);
	}
}