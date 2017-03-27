

package cell_test;

import static org.junit.Assert.*;

import org.junit.Test;

import cell.Road;

/** @author Muhamad Irfan Maulana (13515037).
 */

public class RoadTest {
  @Test
  public void test() {
    Road road = new Road(1,2);
    assertEquals(1,road.getCellAbsis());
    assertEquals(2,road.getCellOrdinat());

    road.setVisited(true);
    assertTrue(road.isVisited());
    road.setVisited(false);
    assertFalse(road.isVisited());
  }
}
