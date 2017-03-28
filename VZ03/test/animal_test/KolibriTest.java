package animal_test;

import animal.Kolibri;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertTrue;


/**  Test untuk kelas Kolibri.
 */

/** @author Muhamad Irfan Maulana (13515037).
 */

public class KolibriTest {

  @Test
  public void test() {
    Kolibri kolibri = new Kolibri(50,1,2);
    assertEquals(50,kolibri.getWeight());
    assertEquals(1,kolibri.getAnimalAbsis());
    assertEquals(2,kolibri.getAnimalOrdinat());
    assertTrue(kolibri.getTamed());
    assertArrayEquals(new boolean[]{false,false,true},kolibri.getAnimalNature().getStatus());
  }

}
