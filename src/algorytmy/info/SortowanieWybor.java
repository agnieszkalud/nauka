package algorytmy.info;

public class SortowanieWybor {
	int tablica[];
	int n;

	public SortowanieWybor(int n) {
		this.n = n;
		uzupelnianieTablicy();
	}

	private void uzupelnianieTablicy() {
		tablica = new int[n];
		for (int a = 0; a < n; a++) {
			tablica[a] = (int) (Math.random() * 100);
		}
	}

	public void wydrukujTablice() {
		for (int i = 0; i < tablica.length; i++) {
			System.out.print(tablica[i] + " ");
		}
		System.out.println("");
	}

	public void sotowaniePrzezWybor() {
		for (int i = 0; i < tablica.length - 1; i++) {
			int najmniejsza = i;
			for (int j = i + 1; j < tablica.length; j++) {
				if (tablica[j] < tablica[najmniejsza]) {
					najmniejsza = j;
				}
			}
			int pomocnicza = tablica[najmniejsza];
			tablica[najmniejsza] = tablica[i];
			tablica[i] = pomocnicza;
		}
	}
}
