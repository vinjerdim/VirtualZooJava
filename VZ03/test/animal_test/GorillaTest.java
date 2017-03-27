

package animal_test;

import static org.junit.Assert.*;

import org.junit.Test;

import animal.*;


/** @author Patrick NH (13515040).
 */

public class GorillaTest {

  @Test
  public void test() {
  Gorilla gorilla = new Gorilla(50,1,2);
    assertEquals(50,gorilla.getWeight());
    assertEquals(1,gorilla.getAnimalAbsis());
    assertEquals(2,gorilla.getAnimalOrdinat());
    assertFalse(gorilla.getTamed());
    assertArrayEquals(new boolean[]{true,false,false},gorilla.getAnimalNature().getStatus());
  }

}
