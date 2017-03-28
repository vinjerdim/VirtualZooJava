/**
 * CageArray merupakan koleksi bertipe Cage
 */

package zoo;

import animal.Animal;

import cell.Habitat;

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

  public void setHabitatByIndex(int indexCage, int indexHabitat, Habitat habitat) {
    cageArray[indexCage].setHabitatByIndex(indexHabitat, habitat);
  }

  public void setAnimalByIndex(int indexCage, int indexAnimal, Animal animal) {
    cageArray[indexCage].setAnimalByIndex(indexAnimal, animal);
  }

  public int numberOfCage() {
    return cageArray.length;
  }

  public int getCageIndex(int absis, int ordinat) {
    int i = 0;
    boolean found = false;
    while (i < numberOfCage() && !found) {
      if (cageArray[i].getHabitatIndex(absis, ordinat) != -1) {
        found = true;
      } else {
        i++;
      }
    }
    return (found) ? i : -1;
  }

}
