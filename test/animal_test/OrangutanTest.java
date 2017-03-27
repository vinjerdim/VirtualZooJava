package animal_test;

import static org.junit.Assert.*;
import org.junit.Test;
import animal.Orangutan;

/**
 * Test untuk kelas Orangutan
 */

/**
 * @author Muhamad Irfan Maulana (13515037)
 *
 */

public class OrangutanTest {

	@Test
	public void test() {
		Orangutan orangutan = new Orangutan(50,1,2);
		assertEquals(50,orangutan.getWeight());
		assertEquals(1,orangutan.getAnimalAbsis());
		assertEquals(2,orangutan.getAnimalOrdinat());
		assertTrue(orangutan.getTamed());
		assertArrayEquals(new boolean[]{true,false,false},orangutan.getAnimalNature().getStatus());
	}

}
