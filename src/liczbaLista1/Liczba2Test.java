/**
 * 
 */
package liczbaLista1;

import junit.framework.TestCase;

/**
 * @author - Agnieszka
 * 
 */
public class Liczba2Test extends TestCase {

	Liczba2 liczba2;
	private int liczba;

	protected void setUp() throws Exception {
		super.setUp();
		this.liczba = 13;
		liczba2 = new Liczba2(liczba);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		liczba2 = null;
	}


	public final void testLiczba2() {
		assertNotNull(liczba2);
	}

	public final void testpoprawnoscLiczby() {
		assertFalse(liczba < 0);
		assertTrue(liczba > 0);
	}

	public final void testKonwersjaNaInnySystem() {
		int system = 8;
		String wynikKonwersji = liczba2.konwersjaNaInnySystem(system);
		assertTrue(wynikKonwersji == "15");
	}

	public final void testKonwersja() {
		int system = 2;
		String wynikKonwersji = liczba2.konwersja(system);
		assertEquals(1101, wynikKonwersji);
		assertTrue(wynikKonwersji == "1101");
	}

	public final void testMain() {
		fail("Not yet implemented"); // TODO

	}

}
