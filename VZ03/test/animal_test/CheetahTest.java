

package animal_test;

import static org.junit.Assert.*;

import org.junit.Test;

import animal.*;

/**  Test untuk kelas Cheetah
 */
/** @author Patrick NH (13515040).
 */

public class CheetahTest {

  @Test
  public void test() {
  Cheetah cheetah = new Cheetah(50,1,2);
    assertEquals(50,cheetah.getWeight());
    assertEquals(1,cheetah.getAnimalAbsis());
    assertEquals(2,cheetah.getAnimalOrdinat());
    assertFalse(cheetah.getTamed());
    assertArrayEquals(new boolean[]{true,false,false},cheetah.getAnimalNature().getStatus());
  }

}
