/**
 * 
 */
package cell_test;

import static org.junit.Assert.*;

import org.junit.Test;

import cell.Restaurant;

/**
 * @author Patrick NH (13515040)
 *
 */
public class RestaurantTest {

  @Test
  public void test() {
	Restaurant restaurant = new Restaurant(2,2);
	assertEquals(2, restaurant.getCellAbsis());
	assertEquals(2, restaurant.getCellOrdinat());
  }

}
