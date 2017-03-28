

package celltest;

import cell.Entrance;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertTrue;


/** @author Muhamad Irfan Maulana (13515037).
 */

public class EntranceTest {

  @Test
  public void test() {
    Entrance entrance = new Entrance(1,2);
    assertEquals(1,entrance.getCellAbsis());
    assertEquals(2,entrance.getCellOrdinat());
  }

}
