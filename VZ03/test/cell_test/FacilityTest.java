package cell_test;

import cell.Facility;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertTrue;


/** @author Patrick NH (13515040).
 */

public class FacilityTest {

  @Test
  public void test() {
    Facility facility = new Facility(2,2);
    assertEquals(2, facility.getCellAbsis());
    assertEquals(2, facility.getCellOrdinat());
  }

}
