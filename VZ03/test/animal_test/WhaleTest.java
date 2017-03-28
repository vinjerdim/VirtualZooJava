package animal_test;

import animal.Whale;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertTrue;


/**  Test untuk kelas Whale.
 */

/** @author Muhamad Irfan Maulana (13515037).
 */

public class WhaleTest {

  @Test
  public void test() {
    Whale whale = new Whale(50,1,2);
    assertEquals(50,whale.getWeight());
    assertEquals(1,whale.getAnimalAbsis());
    assertEquals(2,whale.getAnimalOrdinat());
    assertTrue(whale.getTamed());
    assertArrayEquals(new boolean[]{false,true,false},whale.getAnimalNature().getStatus());
  }

}
