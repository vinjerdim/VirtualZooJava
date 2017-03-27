/**
 * 
 */
package animal_test;

import static org.junit.Assert.*;
import org.junit.Test;
import animal.*;

/**
 * Test untuk kelas Panda
 */

/**
 * @author Martin Lutta Putra (13515121)	
 *
 */
public class PandaTest {

	@Test
	public void test() {
		Panda panda = new Panda(50, 1, 2);
		assertEquals(50, panda.getWeight());
		assertEquals(1, panda.getAnimalAbsis());
		assertEquals(2, panda.getAnimalOrdinat());
		assertTrue(panda.getTamed());
		assertArrayEquals(new boolean[] { true, false, false }, panda.getAnimalNature().getStatus());
	}
}
