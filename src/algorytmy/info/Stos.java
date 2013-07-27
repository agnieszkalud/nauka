package algorytmy.info;

/**
 * stos (ang. stack) - umożliwia dostęp tylko do jednego lementu - ostatniego,
 * LIFO (Last-In-First-Out,"ostatni wszedł, pierwszy wyszedł" );
 * 
 */
public class Stos {

	private int maxRozmiar;
	private int[] tabStosu;
	private int szczyt;// ang. top

	/**
	 * konstruktor - ustawia rozmiar tablicy, tworzy tablice, inkrementuje
	 * zmienna wskazujaca na element na stosie
	 * 
	 * @param s
	 */
	public Stos(int s) {
		maxRozmiar = s;
		tabStosu = new int[maxRozmiar];
		szczyt = -1;// na razie brak elementow
	}

	/**
	 * metoda odluz(ang. push)do odkladania elementow na szczyt stosu
	 */
	public void odloz(int j) {
		tabStosu[++szczyt] = j;// zwiekszam szyt(ang. top), odkladam element
	}

	/**
	 * zdejmij(ang. pop) pobiera element ze szytu stosu
	 */
	public int zdejmij() {
		if (jestPusty()) {
			System.out.println("Stos jest pusty");
			return -1;
		}
		return tabStosu[szczyt--];// pobieram element, zmniejszam szczyt
	}

	/**
	 * podejrzyj(ang. peek) podglada wartosc na szczycie stosu
	 * 
	 * @return
	 */
	public void podejrzyj() {
		if (jestPusty()) {
			System.out.println("Stos jest pusty");
			return;
		}
		System.out.println("Wartość na szczycie: " + tabStosu[szczyt]);
	}

	/**
	 * zwraca true jesli stos pusty
	 * 
	 * @return
	 */
	public boolean jestPusty() {
		return (szczyt == -1);
	}

	public boolean jestPelny() {
		return (szczyt == maxRozmiar - 1);
	}

	public void zobaczSklad() {
		int pomocnicza = szczyt;
		while (pomocnicza != -1) {
			System.out.print(tabStosu[pomocnicza] + " ");
			pomocnicza--;
		}
		System.out.println("");
	}

	public void zdejmijWszystko() {
		while (!jestPusty()) {
			zdejmij();
		}
	}
}
