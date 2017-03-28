package animaltest;

import animal.Seaturtle;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertTrue;


/**  Test untuk kelas seaturtle.
 */

/** @author Martin Lutta Putra (13515121).
 */

public class SeaturtleTest {

  @Test
  public void test() {
    Seaturtle seaturtle = new Seaturtle(50, 1, 2);
    assertEquals(50, seaturtle.getWeight());
    assertEquals(1, seaturtle.getAnimalAbsis());
    assertEquals(2, seaturtle.getAnimalOrdinat());
    assertTrue(seaturtle.getTamed());
    assertArrayEquals(new boolean[] { false, true, false },seaturtle.getAnimalNature().getStatus());
  }
}
