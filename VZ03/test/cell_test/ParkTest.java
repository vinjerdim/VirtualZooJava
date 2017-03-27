

package cell_test;

import static org.junit.Assert.*;

import org.junit.Test;

import cell.Park;

/** @author Muhamad Irfan Maulana (13515037).
 */

public class ParkTest {

  @Test
  public void test() {
    Park park = new Park(5,10);
    assertEquals(5,park.getCellAbsis());
    assertEquals(10,park.getCellOrdinat());
  }

}
