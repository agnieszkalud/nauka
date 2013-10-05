package liczbaLista1;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class LiczbaTest {

	private int liczbaDoKonwersji;
	Liczba liczba;

	@Before
	public void setUp() throws Exception {
		this.liczbaDoKonwersji = 16;
		liczba = new Liczba(liczbaDoKonwersji);
	}

	@After
	public void tearDown() throws Exception {
		liczba = null;
	}

	@Test(expected = LiczbaException.class)
	public void testujWyjatek() throws LiczbaException {
		int nieprawidłowaLiczba = -1;
		liczba = new Liczba(nieprawidłowaLiczba);
	}

	@Ignore
	public final void testKonwersjaNaSzstemBinarny() {
		int system = 2;
		String wynikKonwersji = liczba.konwersjaNaInnySystem(system);
		wynikKonwersji.equals("10000");
	}


	@Test(timeout = 999999999)
	public final void testKonwersjaNaSzstemTrójkowy() {
		int system = 16;
		String wynikKonwersji = liczba.konwersjaNaInnySystem(system);
		wynikKonwersji.equals("121");
	}

	@Ignore
	public final void testKonwersjaNaSzstemCzworkowy() {
		int system = 4;
		String wynikKonwersji = liczba.konwersjaNaInnySystem(system);// odp.100
		wynikKonwersji.equals("24");
	}

	@Test
	public final void testKonwersjaNaSzstemPiatkowy() {
		int system = 5;
		String wynikKonwersji = liczba.konwersjaNaInnySystem(system);
		wynikKonwersji.equals("31");
	}

	@Test
	public final void testKonwersjiNaSystemSzostkowy() {
		int system = 6;
		String wynikKonwersji = liczba.konwersjaNaInnySystem(system);// odp.24
		wynikKonwersji.equals("23");
	}// TODO nie zglasza bledu?

	@Test
	public final void testKonwersjaNaSzstemSiodemkowy() {
		int system = 7;
		String wynikKonwersji = liczba.konwersjaNaInnySystem(system);
		wynikKonwersji.equals("22");
	}

	@Test
	public final void testKonwersjaNaSzstemOsemkowy() {
		int system = 8;
		String wynikKonwersji = liczba.konwersjaNaInnySystem(system);
		wynikKonwersji.equals("20");
	}

	@Test
	public final void testKonwersjaNaSzstemDziewiatkowy() {
		int system = 9;
		String wynikKonwersji = liczba.konwersjaNaInnySystem(system);
		wynikKonwersji.equals("17");
	}

	@Test
	public final void testKonwersjaNaSzstemDziesiatkowy() {
		int system = 10;
		String wynikKonwersji = liczba.konwersjaNaInnySystem(system);
		wynikKonwersji.equals("16");
	}

	@Test
	public final void testKonwersjaNaSzstemJedenastkowy() {
		int system = 11;
		String wynikKonwersji = liczba.konwersjaNaInnySystem(system);
		wynikKonwersji.equals("15");
	}

	@Test
	public final void testKonwersjaNaSzstemDwunastkowy() {
		int system = 12;
		String wynikKonwersji = liczba.konwersjaNaInnySystem(system);
		wynikKonwersji.equals("14");
	}

	@Test
	public final void testKonwersjaNaSzstemTrzynastkowy() {
		int system = 13;
		String wynikKonwersji = liczba.konwersjaNaInnySystem(system);
		wynikKonwersji.equals("13");
	}

	@Test
	public final void testKonwersjaNaSzstemCznernastkowy() {
		int system = 14;
		String wynikKonwersji = liczba.konwersjaNaInnySystem(system);
		wynikKonwersji.equals("12");
	}

	@Test
	public final void testKonwersjaNaSzstemPietnastkowy() {
		int system = 15;
		String wynikKonwersji = liczba.konwersjaNaInnySystem(system);
		wynikKonwersji.equals("11");
	}

	@Test
	public final void testKonwersjaNaSzstemSzesnastkowy() {
		int system = 16;
		String wynikKonwersji = liczba.konwersjaNaInnySystem(system);
		wynikKonwersji.equals("10");
	}


}
