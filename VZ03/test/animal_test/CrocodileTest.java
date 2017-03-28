package animal_test;

import animal.Crocodile;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertTrue;


/**  Test untuk kelas Crocodile.
 */

/** @author Martin Lutta Putra (13515121).
 */

public class CrocodileTest {

  @Test
  public void test() {
    Crocodile crocodile = new Crocodile(50, 1, 2);
    assertEquals(50, crocodile.getWeight());
    assertEquals(1, crocodile.getAnimalAbsis());
    assertEquals(2, crocodile.getAnimalOrdinat());
    assertFalse(crocodile.getTamed());
    assertArrayEquals(new boolean[] { false, true, false }, crocodile.getAnimalNature().getStatus());
  }
}
