
package animal_test;

import static org.junit.Assert.*;

import org.junit.Test;

import animal.Cendrawasih;

/**  Test untuk kelas Cendrawasih
 */

/** @author Muhamad Irfan Maulana (13515037).
 */

public class CendrawasihTest {

  @Test
  public void test() {
    Cendrawasih cendrawasih = new Cendrawasih(50,1,2);
    assertEquals(50,cendrawasih.getWeight());
    assertEquals(1,cendrawasih.getAnimalAbsis());
    assertEquals(2,cendrawasih.getAnimalOrdinat());
    assertTrue(cendrawasih.getTamed());
    assertArrayEquals(new boolean[]{false,false,true},cendrawasih.getAnimalNature().getStatus());
  }

}
