package algorytmy.info;

// http://www.zadania.info/d918/9963707
public class SumaKolejnychLiczbNieparzystych {
	public static int wyznaczSumeKolejnychLiczbNieparzystych(int n) {
		/**
		 * jeśli n jest liczbą parzystą wówczas wzór na sume = (1+n-1)/2*n/2
		 */
		if (n % 2 == 0) {
			return n * n / 4;
		} else {
			return (n - 1) * n / 4;
		}

}
}
