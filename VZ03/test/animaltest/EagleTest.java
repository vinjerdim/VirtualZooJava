package animaltest;

import animal.Eagle;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertTrue;


/**  Test untuk kelas Eagle.
 */

/** @author Muhamad Irfan Maulana (13515037).
 */

public class EagleTest {

  @Test
  public void test() {
    Eagle eagle = new Eagle(50,1,2);
    assertEquals(50,eagle.getWeight());
    assertEquals(1,eagle.getAnimalAbsis());
    assertEquals(2,eagle.getAnimalOrdinat());
    assertFalse(eagle.getTamed());
    assertArrayEquals(new boolean[]{false,false,true},eagle.getAnimalNature().getStatus());
  }

}
