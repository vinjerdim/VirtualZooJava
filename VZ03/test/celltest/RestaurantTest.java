

package celltest;

import cell.Restaurant;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertTrue;


/** @author Patrick NH (13515040).
 */

public class RestaurantTest {

  @Test
  public void test() {
    Restaurant restaurant = new Restaurant(2,2);
    assertEquals(2, restaurant.getCellAbsis());
    assertEquals(2, restaurant.getCellOrdinat());
  }

}
