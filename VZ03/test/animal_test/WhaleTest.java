
package animal_test;

import static org.junit.Assert.*;

import org.junit.Test;

import animal.Whale;

/**  Test untuk kelas Whale
 */

/** @author Muhamad Irfan Maulana (13515037).
 */

public class WhaleTest {

  @Test
  public void test() {
    Whale whale = new Whale(50,1,2);
    assertEquals(50,whale.getWeight());
    assertEquals(1,whale.getAnimalAbsis());
    assertEquals(2,whale.getAnimalOrdinat());
    assertTrue(whale.getTamed());
    assertArrayEquals(new boolean[]{false,true,false},whale.getAnimalNature().getStatus());
  }

}
