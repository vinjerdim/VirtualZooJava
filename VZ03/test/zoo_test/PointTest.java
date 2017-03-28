
package zoo_test;

import static org.junit.Assert.*;

import org.junit.Test;

import zoo.Point;
/**  Test untuk kelas Point
 */

/** @author Marvin Jerremy Budiman (13515076).
 */

public class PointTest {

  @Test
  public void test() {
    Point point = new Point(-1,5);
    assertEquals(-1,point.getAbsis());
    assertEquals(5,point.getOrdinat());
  }

}