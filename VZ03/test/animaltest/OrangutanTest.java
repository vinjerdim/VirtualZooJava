package animaltest;

import animal.Orangutan;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertTrue;


/**  Test untuk kelas Orangutan.
 */

/** @author Muhamad Irfan Maulana (13515037).
 */

public class OrangutanTest {

  @Test
  public void test() {
    Orangutan orangutan = new Orangutan(50,1,2);
    assertEquals(50,orangutan.getWeight());
    assertEquals(1,orangutan.getAnimalAbsis());
    assertEquals(2,orangutan.getAnimalOrdinat());
    assertTrue(orangutan.getTamed());
    assertArrayEquals(new boolean[]{true,false,false},orangutan.getAnimalNature().getStatus());
  }

}
