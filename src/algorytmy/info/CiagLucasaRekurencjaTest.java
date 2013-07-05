package algorytmy.info;

public class CiagLucasaRekurencjaTest {

	public static void main(String[] args) {
		System.out.println("Wartość liczby w ciągu Lucasa wynosi " + CiagLucasaRekurencja.rekurencyjnaMetoda(4));
		CiagLucasaRekurencja liczba = new CiagLucasaRekurencja(8);
		System.out.println("Wartośc liczby w ciagu Lucaca obliczana metoda nierekurencyjna wynosi " + liczba.metodaZwykla());
	}
}
