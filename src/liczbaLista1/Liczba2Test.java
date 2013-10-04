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

	protected void setUp() throws Exception {
		super.setUp();
		liczba2 = new Liczba2(13);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		liczba2 = null;
	}


	public final void testLiczba2() {
		fail("Not yet implemented"); // TODO
	}


	public final void testKonwersjaNaInnySystem() {
		fail("Not yet implemented"); // TODO
	}

	public final void testKonwersja() {
		int system = 2;
		String wynikKonwersji = liczba2.konwersja(system);
		assertEquals(1101, wynikKonwersji);
	}

	public final void testMain() {
		fail("Not yet implemented"); // TODO

	}

}
