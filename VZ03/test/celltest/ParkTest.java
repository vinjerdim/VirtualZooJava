

package celltest;

import cell.Park;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertTrue;


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
