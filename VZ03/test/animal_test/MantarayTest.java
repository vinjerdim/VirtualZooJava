

package animal_test;

import static org.junit.Assert.*;

import org.junit.Test;

import animal.*;

/**  Test untuk kelas Mantaray
 */

/** @author Martin Lutta Putra (13515121).  
 */

public class MantarayTest {

  @Test
  public void test() {
    Mantaray Mantaray = new Mantaray(50, 1, 2);
    assertEquals(50, Mantaray.getWeight());
    assertEquals(1, Mantaray.getAnimalAbsis());
    assertEquals(2, Mantaray.getAnimalOrdinat());
    assertTrue(Mantaray.getTamed());
    assertArrayEquals(new boolean[] { false, true, false }, Mantaray.getAnimalNature().getStatus());
  }
}
