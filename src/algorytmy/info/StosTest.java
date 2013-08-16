package algorytmy.info;

public class StosTest {

	public static void main(String[] args) {
		Stos stos = new Stos(5); // stos piecioelementowy

		stos.jestPelny();

		stos.odloz(10);
		stos.odloz(20);
		stos.odloz(30);
		stos.odloz(40);
		stos.odloz(40);
		stos.odloz(40);

		stos.zobaczSklad();

		stos.zdejmijWszystko();
		stos.zobaczSklad();
		stos.zdejmij();
	}
}

