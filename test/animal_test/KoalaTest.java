/**
 * 
 */
package animal_test;

import static org.junit.Assert.*;
import org.junit.Test;
import animal.*;

/**
 * Test untuk kelas Koala
 */
/**
 * @author Patrick NH (13515040)
 *
 */
public class KoalaTest {

  @Test
  public void test() {
	Koala koala = new Koala(50,1,2);
  	assertEquals(50,koala.getWeight());
  	assertEquals(1,koala.getAnimalAbsis());
  	assertEquals(2,koala.getAnimalOrdinat());
  	assertTrue(koala.getTamed());
  	assertArrayEquals(new boolean[]{true,false,false},koala.getAnimalNature().getStatus());

  }

}
