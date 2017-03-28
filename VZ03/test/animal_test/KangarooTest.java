package animal_test;

import animal.Kangaroo;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertTrue;


/**  Test untuk kelas Kangaroo.
 */
/** @author Patrick NH (13515040).
 */

public class KangarooTest {

  @Test
  public void test() {
    Kangaroo kangaroo = new Kangaroo(50,1,2);
    assertEquals(50,kangaroo.getWeight());
    assertEquals(1,kangaroo.getAnimalAbsis());
    assertEquals(2,kangaroo.getAnimalOrdinat());
    assertFalse(kangaroo.getTamed());
    assertArrayEquals(new boolean[]{true,false,false},kangaroo.getAnimalNature().getStatus());
  }

}
