package animaltest;

import animal.Peacock;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertTrue;


/**  Test untuk kelas Peacock.
 */

/** @author Muhamad Irfan Maulana (13515037).
 */

public class PeacockTest {

  @Test
  public void test() {
    Peacock peacock = new Peacock(50,1,2);
    assertEquals(50,peacock.getWeight());
    assertEquals(1,peacock.getAnimalAbsis());
    assertEquals(2,peacock.getAnimalOrdinat());
    assertTrue(peacock.getTamed());
    assertArrayEquals(new boolean[]{true,false,false},peacock.getAnimalNature().getStatus());
  }

}
