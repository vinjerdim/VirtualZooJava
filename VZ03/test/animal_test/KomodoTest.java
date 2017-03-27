

package animal_test;

import static org.junit.Assert.*;

import org.junit.Test;

import animal.*;

/**  Test untuk kelas Komodo
 */

/** @author Martin Lutta Putra (13515121).  
 */

public class KomodoTest {

  @Test
  public void test() {
    Komodo komodo = new Komodo(50, 1, 2);
    assertEquals(50, komodo.getWeight());
    assertEquals(1, komodo.getAnimalAbsis());
    assertEquals(2, komodo.getAnimalOrdinat());
    assertFalse(komodo.getTamed());
    assertArrayEquals(new boolean[] { true, false, false }, komodo.getAnimalNature().getStatus());
  }
}
