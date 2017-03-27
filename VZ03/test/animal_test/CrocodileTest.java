/**
 * 
 */
package animal_test;

import static org.junit.Assert.*;
import org.junit.Test;
import animal.*;

/**
 * Test untuk kelas Crocodile
 */

/**
 * @author Martin Lutta Putra (13515121)	
 *
 */
public class CrocodileTest {

	@Test
	public void test() {
		Crocodile crocodile = new Crocodile(50, 1, 2);
		assertEquals(50, crocodile.getWeight());
		assertEquals(1, crocodile.getAnimalAbsis());
		assertEquals(2, crocodile.getAnimalOrdinat());
		assertFalse(crocodile.getTamed());
		assertArrayEquals(new boolean[] { false, true, false }, crocodile.getAnimalNature().getStatus());
	}
}
