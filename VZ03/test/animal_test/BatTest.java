

package animal_test;

import static org.junit.Assert.*;

import org.junit.Test;

import animal.Bat;

/**  Test untuk kelas Bat
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
