package animaltest;

import animal.Frog;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertTrue;


/**  Test untuk kelas Frog.
 */

/** @author Martin Lutta Putra (13515121).
 */

public class FrogTest {

  @Test
  public void test() {
    Frog frog = new Frog(50, 1, 2);
    assertEquals(50, frog.getWeight());
    assertEquals(1, frog.getAnimalAbsis());
    assertEquals(2, frog.getAnimalOrdinat());
    assertTrue(frog.getTamed());
    assertArrayEquals(new boolean[] { true, true, false }, frog.getAnimalNature().getStatus());
  }
}
