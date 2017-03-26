/**
 * Consumption menyimpan informasi jumlah sayur dan daging untuk makanan seluruh hewan dalam Zoo 
 */
package animal;

/**
 * @author Marvin Jerremy Budiman (13515076)
 *
 */
public class Consumption {
  /** vegetable_amount menyimpan jumlah sayur untuk makanan hewan
   */
  public static double vegetableAmount = 0;

  /** meat_amount menyimpan jumlah sayur untuk makanan hewan
   */
  public static double meatAmount = 0;

  /**I.S. amount lebih besar dari 0
   * F.S. vegetable_amount bertambah sebanyak amount
   * @param amount merupakan jumlah sayur tambahan
   */
  public static void addVegetableAmount(double amount) {
  	vegetableAmount += amount;
  }

  /**I.S. amount lebih besar dari 0
   * F.S. meat_amount bertambah sebanyak amount
   * @param amount merupakan jumlah daging tambahan
   */
  public static void addMeatAmount(double amount) {
  	meatAmount += amount;
  }

  /**I.S. sembarang
   * F.S. sama dengan I.S.
   * @return mengembalikan jumlah sayur untuk makanan hewan
   */
  public static double getVegetableAmount() {
    return vegetableAmount;
  }

  /**I.S. sembarang
   * F.S. sama dengan I.S.
   * @return mengembalikan jumlah daging untuk makanan hewan
   */
  public static double getMeatAmount() {
  	return meatAmount;
  }
}
