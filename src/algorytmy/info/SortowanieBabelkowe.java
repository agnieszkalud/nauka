package algorytmy.info;

public class SortowanieBabelkowe {
	int n;
	int tablica[];

	public SortowanieBabelkowe(int n) {
		this.n = n;
		tablica = uzupelnianieTablicy();
	}

	private int[] uzupelnianieTablicy() {
		for (int a = 0; a < n; a++) {
			tablica[a] = (int) (Math.random() * 100);

		}
		return tablica;
	}

	public void wydrukujTablice() {
		for (int i = 0; i <= tablica.length; i++) {
			System.out.println(tablica[i] + " ");
		}
	}
}
