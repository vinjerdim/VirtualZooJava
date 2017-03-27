package animal_test;

import static org.junit.Assert.*;
import org.junit.Test;
import animal.Ostrich;

/**
 * Test untuk kelas Ostrich
 */

/**
 * @author Muhamad Irfan Maulana (13515037)
 *
 */

public class OstrichTest {

	@Test
	public void test() {
		Ostrich ostrich = new Ostrich(50,1,2);
		assertEquals(50,ostrich.getWeight());
		assertEquals(1,ostrich.getAnimalAbsis());
		assertEquals(2,ostrich.getAnimalOrdinat());
		assertTrue(ostrich.getTamed());
		assertArrayEquals(new boolean[]{true,false,false},ostrich.getAnimalNature().getStatus());
	}

}
