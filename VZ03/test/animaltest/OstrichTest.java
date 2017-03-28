package animaltest;

import animal.Ostrich;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertTrue;


/**  Test untuk kelas Ostrich.
 */

/** @author Muhamad Irfan Maulana (13515037).
 */

public class OstrichTest {

  @Test
  public void test() {
    Ostrich ostrich = new Ostrich(50,1,2);
    assertEquals(50,ostrich.getWeight());
    assertEquals(1,ostrich.getAnimalAbsis());
    assertEquals(2,ostrich.getAnimalOrdinat());
    assertTrue(ostrich.getTamed());
    assertArrayEquals(new boolean[]{true,false,false},ostrich.getAnimalNature().getStatus());
  }

}
