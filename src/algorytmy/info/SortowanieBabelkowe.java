package algorytmy.info;

public class SortowanieBabelkowe {
	int n;
	int tablica[];
	int najwieksza = 0;

	public SortowanieBabelkowe(int n) {
		this.n = n;
		tablica = new int[n];
		tablica = uzupelnianieTablicy();
	}

	private int[] uzupelnianieTablicy() {
		for (int a = 0; a < n; a++) {
			tablica[a] = (int) (Math.random() * 100);
		}
		return tablica;
	}

	public void wydrukujTablice() {
		for (int i = 0; i < tablica.length; i++) {
			System.out.print(tablica[i] + " ");
		}
		System.out.println("");
	}

	public void sortujRosnaco() {
		for (int i = 0; i < tablica.length; i++) {
			if (tablica[i] > najwieksza) {
				najwieksza = tablica[i];
			}
		}
		for (int j = 0; j < n; j++) {
			for (int a = 0; a < n - 1; a++) {
					if (tablica[a] > tablica[a + 1]) {
						int pomocnicza = tablica[a + 1];
						tablica[a + 1] = tablica[a];
						tablica[a] = pomocnicza;
					}
			}
		}
	}

	public void sortujMalejaco() {
		for (int i = 0; i < tablica.length; i++) {
			if (tablica[i] > najwieksza) {
				najwieksza = tablica[i];
			}
		}
		for (int j = 0; j < n; j++) {
			for (int a = 0; a < n - 1; a++) {
				if (tablica[a] < tablica[a + 1]) {
					int pomocnicza = tablica[a + 1];
					tablica[a + 1] = tablica[a];
					tablica[a] = pomocnicza;
				}
			}
		}
	}

}
