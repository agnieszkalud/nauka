package algorytmy.info;

public class ListaJednokierunkowaWezel {

	String klucz;
	ListaJednokierunkowaWezel nastepca;

	public ListaJednokierunkowaWezel() {
		klucz = null;
		nastepca = null;
	}

	public ListaJednokierunkowaWezel(String klucz, ListaJednokierunkowaWezel nastepca) {
		this.klucz = klucz;
		this.nastepca = nastepca;
	}

	public ListaJednokierunkowaWezel getNastepce() {
		return nastepca;
	}

	public void setNastepce(ListaJednokierunkowaWezel nastepca) {
		this.nastepca = nastepca;
	}

	public String toString() {
		return klucz.toString();
	}

}
