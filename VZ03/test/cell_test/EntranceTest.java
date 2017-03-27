

package cell_test;

import static org.junit.Assert.*;

import org.junit.Test;

import cell.Entrance;

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
