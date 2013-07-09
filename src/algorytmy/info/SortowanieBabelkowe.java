package algorytmy.info;
/**
 * Algorytm:
	SORTOWANIE-BĄBELKOWE(A)
	1. for i := 2 to n do
	2. for j := n downto i do
	3. if A[j] < A[j − 1] then
	4. A[j] ↔ A[j – 1]
	 
 * @author - Agneszka
 *
 */
public class SortowanieBabelkowe {
	// int n;
	// int tablica[];

	// public SortowanieBabelkowe(int n) {
	// this.n = n;
	// tablica = new int[n];
	// uzupelnianieTablicy();
	// }

	// private void uzupelnianieTablicy() {
	//
	// for (int a = 0; a < n; a++) {
	// tablica[a] = (int) (Math.random() * 100);
	// }
	// }

	public static void wydrukujTablice(int[] tablica) {
		for (int i = 0; i < tablica.length; i++) {
			System.out.print(tablica[i] + " ");
		}
		System.out.println("");
	}

//	public static int[] sortujRosnaco(int[] tablica) {
	public static sortujRosnaco(int[] tablica) {

		for (int j = 0; j < tablica.length; j++) {
			for (int a = 0; a < tablica.length - 1; a++) {
					if (tablica[a] > tablica[a + 1]) {
						int pomocnicza = tablica[a + 1];
						tablica[a + 1] = tablica[a];
						tablica[a] = pomocnicza;
					}
			}
		}
		for (int i = 0; i < tablica.length; i++) {
			System.out.print(tablica[i] + " ");
		}
		System.out.println("");
	}
		//return tablica;
	}

	public static int[] sortujMalejaco(int[] tablica) {

		for (int j = 0; j < tablica.length; j++) {
			for (int a = 0; a < tablica.length - 1; a++) {
				if (tablica[a] < tablica[a + 1]) {
					int pomocnicza = tablica[a + 1];
					tablica[a + 1] = tablica[a];
					tablica[a] = pomocnicza;
				}
			}
		}
		return tablica;
	}

}
