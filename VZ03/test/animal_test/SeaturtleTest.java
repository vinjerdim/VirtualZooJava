

package animal_test;

import static org.junit.Assert.*;

import org.junit.Test;

import animal.*;

/**  Test untuk kelas Seaturtle
 */

/** @author Martin Lutta Putra (13515121).  
 */

public class SeaturtleTest {

  @Test
  public void test() {
    Seaturtle Seaturtle = new Seaturtle(50, 1, 2);
    assertEquals(50, Seaturtle.getWeight());
    assertEquals(1, Seaturtle.getAnimalAbsis());
    assertEquals(2, Seaturtle.getAnimalOrdinat());
    assertTrue(Seaturtle.getTamed());
    assertArrayEquals(new boolean[] { false, true, false }, Seaturtle.getAnimalNature().getStatus());
  }
}
