/**
 * 
 */
package cell_test;

import static org.junit.Assert.*;
import org.junit.Test;
import cell.Facility;

/**
 * @author Patrick NH (13515040)
 *
 */
public class FacilityTest {

  @Test
  public void test() {
	Facility facility = new Facility(2,2);
	assertEquals(2, facility.getCellAbsis());
	assertEquals(2, facility.getCellOrdinat());
  }

}
