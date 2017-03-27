

package animal_test;

import static org.junit.Assert.*;

import org.junit.Test;

import animal.*;

/**  Test untuk kelas Dolphin.
 */
/** @author Patrick NH (13515040).
 */

public class DolphinTest {

  @Test
  public void test() {
    Dolphin dolphin = new Dolphin(50,1,2);
    assertEquals(50,dolphin.getWeight());
    assertEquals(1,dolphin.getAnimalAbsis());
    assertEquals(2,dolphin.getAnimalOrdinat());
    assertTrue(dolphin.getTamed());
    assertArrayEquals(new boolean[]{false,true,false},dolphin.getAnimalNature().getStatus());

  }

}
