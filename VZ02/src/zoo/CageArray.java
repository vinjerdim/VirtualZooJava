/**
 * CageArray merupakan koleksi bertipe Cage
 */
package zoo;

import zoo.Cage;

/**
 * @author Marvin Jerremy Budiman (13515076).
 *
 */
public class CageArray {
  private Cage[] cageArray;

  public CageArray(int numberOfCage) {
    cageArray = new Cage[numberOfCage];
  }

  public Cage getCageByIndex(int index) {
    return cageArray[index];
  }

  public void setCageByIndex(int index, Cage cage) {
    cageArray[index] = cage;
  }

  public int numberOfCage() {
    return cageArray.length;
  }

  public int getCageIndex(int absis, int ordinat) {
    int i = 0;
    boolean found = false;
    while (i < numberOfCage() && !found) {
      if (cageArray[i].getCellIndex(absis, ordinat) != -1) {
        found = true;
      } else {
        i++;
      }
    }
    return (found) ? i : -1;
  }

  /**
   * I.S. numberOfCage lebih besar dari 0
   * F.S. coordinate setiap Animal dalam cageArray tetap sama atau berubah
   */
  public void moveAnimalInCage() {
    for (int i = 0;i < numberOfCage();i++) {
      cageArray[i].moveAnimalInCage();
    }
  }
}
