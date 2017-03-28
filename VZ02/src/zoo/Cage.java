/**
 *
 */
package zoo;

import cell.Cell;

/** @author Martin Lutta Putra (13515121).
 *
 *
 */
public class Cage {
  private Cell[] cellArray;
  private Cell[] animalArray;

  public Cage(int numberOfCell,int numberOfAnimal) {
    cellArray = new Cell[numberOfCell];
    animalArray = new Cell[numberOfAnimal];
  }

  public int numberOfCell() {
    return cellArray.length;
  }

  public int numberOfAnimal() {
    return animalArray.length;
  }

  public Cell getCellByIndex(int index) {
    return cellArray[index];
  }

  public void setCellByIndex(int index, Cell cell) {
    cellArray[index] = cell;
  }

  public Cell getAnimalByIndex(int index) {
    return animalArray[index];
  }

  public void setAnimalByIndex(int index, Cell animal) {
    animalArray[index] = animal;
  }

  public int getCellIndex(int absis, int ordinat) {
    int i = 0;
    boolean found = false;
    while (i < numberOfCell() && !found) {
      if (cellArray[i].getCellAbsis() == absis && cellArray[i].getCellOrdinat() == ordinat) {
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
