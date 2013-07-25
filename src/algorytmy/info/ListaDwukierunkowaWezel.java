package algorytmy.info;

public class ListaDwukierunkowaWezel {

	String klucz;
	ListaDwukierunkowaWezel nastepca;
	ListaDwukierunkowaWezel poprzednik;

	public ListaDwukierunkowaWezel() {
		klucz = null;
		nastepca = null;
		poprzednik = null;
	}

	public ListaDwukierunkowaWezel(String klucz, ListaDwukierunkowaWezel poprzednik, ListaDwukierunkowaWezel nastepca) {
		this.klucz = klucz;
		this.nastepca = nastepca;
		this.poprzednik = poprzednik;
	}

	public ListaDwukierunkowaWezel getNastepce() {
		return nastepca;
	}

	public ListaDwukierunkowaWezel getPoprzednika() {
		return poprzednik;
	}

	public void setNastepce(ListaDwukierunkowaWezel nastepca) {
		this.nastepca = nastepca;
	}

	public void setPoprzednika(ListaDwukierunkowaWezel poprzednik) {
		this.poprzednik = poprzednik;
	}

	public String getKlucz() {
		return klucz;
	}

	/*
	 * public void setKlucz(String klucz) { this.klucz = klucz; }
	 */
	public String toString() {
		return klucz.toString();
	}
}
