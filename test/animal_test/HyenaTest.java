/**
 * 
 */
package animal_test;

import static org.junit.Assert.*;
import org.junit.Test;
import animal.*;

/**
 * Test untuk kelas Hyena
 */
/**
 * @author Patrick NH (13515040)
 *
 */
public class HyenaTest {

  @Test
  public void test() {
	Hyena hyena = new Hyena(50,1,2);
  	assertEquals(50,hyena.getWeight());
  	assertEquals(1,hyena.getAnimalAbsis());
  	assertEquals(2,hyena.getAnimalOrdinat());
  	assertFalse(hyena.getTamed());
  	assertArrayEquals(new boolean[]{true,false,false},hyena.getAnimalNature().getStatus());
  }

}
