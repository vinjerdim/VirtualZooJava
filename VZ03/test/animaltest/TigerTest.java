package animaltest;

import animal.Tiger;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertTrue;


/**  Test untuk kelas Tiger.
 */
/** @author Patrick NH (13515040).
 */

public class TigerTest {

  @Test
  public void test() {
    Tiger tiger = new Tiger(50,1,2);
    assertEquals(50,tiger.getWeight());
    assertEquals(1,tiger.getAnimalAbsis());
    assertEquals(2,tiger.getAnimalOrdinat());
    assertFalse(tiger.getTamed());
    assertArrayEquals(new boolean[]{true,false,false},tiger.getAnimalNature().getStatus());
  }

}
