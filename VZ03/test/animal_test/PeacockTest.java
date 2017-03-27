package animal_test;

import static org.junit.Assert.*;
import org.junit.Test;
import animal.Peacock;

/**
 * Test untuk kelas Peacock
 */

/**
 * @author Muhamad Irfan Maulana (13515037)
 *
 */

public class PeacockTest {

	@Test
	public void test() {
		Peacock peacock = new Peacock(50,1,2);
		assertEquals(50,peacock.getWeight());
		assertEquals(1,peacock.getAnimalAbsis());
		assertEquals(2,peacock.getAnimalOrdinat());
		assertTrue(peacock.getTamed());
		assertArrayEquals(new boolean[]{true,false,false},peacock.getAnimalNature().getStatus());
	}

}
