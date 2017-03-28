/**
 * Cage melingkupi sekumpulan Habitat beserta Animal di dalamnya
 */

package zoo;

import animal.Animal;

import cell.Habitat;

/**
 * @author Marvin Jerremy Budiman (13515076).
 *
 */
public class Cage {
  private Habitat[] habitatArray;
  private Animal[] animalArray;

  public Cage(int numberOfHabitat,int numberOfAnimal) {
    habitatArray = new Habitat[numberOfHabitat];
    animalArray = new Animal[numberOfAnimal];
  }

  public int numberOfHabitat() {
    return habitatArray.length;
  }

  public int numberOfAnimal() {
    return animalArray.length;
  }

  public Habitat getHabitatByIndex(int index) {
    return habitatArray[index];
  }

  public void setHabitatByIndex(int index, Habitat habitat) {
    habitatArray[index] = habitat;
  }

  public Animal getAnimalByIndex(int index) {
    return animalArray[index];
  }

  public void setAnimalByIndex(int index, Animal animal) {
    animalArray[index] = animal;
  }

  public int getHabitatIndex(int absis, int ordinat) {
    int i = 0;
    boolean found = false;
    while (i < numberOfHabitat() && !found) {
      if (habitatArray[i].getCellAbsis() == absis && habitatArray[i].getCellOrdinat() == ordinat) {
        found = true;
      } else {
        i++;
      }
    }
    return (found) ? i : -1;
  }

  public void wakeAnimalInCage() {
    for (int i = 0;i < numberOfAnimal();i++) {
      animalArray[i].interact();
    }
  }
}
