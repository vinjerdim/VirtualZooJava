/**
 * 
 */
package animal_test;

import static org.junit.Assert.*;
import org.junit.Test;
import animal.*;

/**
 * Test untuk kelas Shark
 */

/**
 * @author Martin Lutta Putra (13515121)	
 *
 */
public class SharkTest {

	@Test
	public void test() {
		Shark Shark = new Shark(50, 1, 2);
		assertEquals(50, Shark.getWeight());
		assertEquals(1, Shark.getAnimalAbsis());
		assertEquals(2, Shark.getAnimalOrdinat());
		assertFalse(Shark.getTamed());
		assertArrayEquals(new boolean[] { false, true, false }, Shark.getAnimalNature().getStatus());
	}
}
