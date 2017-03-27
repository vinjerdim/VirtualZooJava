

package animal_test;

import static org.junit.Assert.*;

import org.junit.Test;

import animal.*;

/** @author Patrick NH (13515040).
 */

public class ChimpanzeeTest {

  @Test
  public void test() {
  Chimpanzee chimpanzee = new Chimpanzee(50,1,2);
    assertEquals(50,chimpanzee.getWeight());
    assertEquals(1,chimpanzee.getAnimalAbsis());
    assertEquals(2,chimpanzee.getAnimalOrdinat());
    assertTrue(chimpanzee.getTamed());
    assertArrayEquals(new boolean[]{true,false,false},chimpanzee.getAnimalNature().getStatus());
  }

}
