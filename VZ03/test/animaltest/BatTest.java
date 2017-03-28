package animaltest;

import animal.Bat;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertTrue;


/**  Test untuk kelas Bat.
 */

/** @author Muhamad Irfan Maulana (13515037).
 */

public class BatTest {

  @Test
  public void test() {
    Bat bat = new Bat(50,1,2);
    assertEquals(50,bat.getWeight());
    assertEquals(1,bat.getAnimalAbsis());
    assertEquals(2,bat.getAnimalOrdinat());
    assertTrue(bat.getTamed());
    assertArrayEquals(new boolean[]{false,false,true},bat.getAnimalNature().getStatus());
  }

}
