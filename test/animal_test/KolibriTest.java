package animal_test;

import static org.junit.Assert.*;
import org.junit.Test;
import animal.Kolibri;

/**
 * Test untuk kelas Kolibri
 */

/**
 * @author Muhamad Irfan Maulana (13515037)
 *
 */

public class KolibriTest {

	@Test
	public void test() {
		Kolibri kolibri = new Kolibri(50,1,2);
		assertEquals(50,kolibri.getWeight());
		assertEquals(1,kolibri.getAnimalAbsis());
		assertEquals(2,kolibri.getAnimalOrdinat());
		assertTrue(kolibri.getTamed());
		assertArrayEquals(new boolean[]{false,false,true},kolibri.getAnimalNature().getStatus());
	}

}
