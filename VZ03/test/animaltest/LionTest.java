package animaltest;

import animal.Lion;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertTrue;


/**  Test untuk kelas Lion.
 */

/** @author Marvin Jerremy Budiman (13515076).
 */

public class LionTest {
  @Test
  public void test() {
    Lion lion = new Lion(50,1,2);
    assertEquals(50,lion.getWeight());
    assertEquals(1,lion.getAnimalAbsis());
    assertEquals(2,lion.getAnimalOrdinat());
    assertFalse(lion.getTamed());
    assertArrayEquals(new boolean[]{true,false,false},lion.getAnimalNature().getStatus());
  }
}