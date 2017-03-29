/**
 * Cage melingkupi sekumpulan Habitat beserta Animal di dalamnya
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

  /**
   * Konstruktor kelas Cage
   * I.S. sembarang
   * F.S. cellArray dan animalArray dialokasi
   * @param numberOfCell jumlah Habitat dalam suatu Cage
   * @param numberOfAnimal jumlah Hewan dalam suatu Cage
   */
  public Cage(int numberOfCell,int numberOfAnimal) {
    cellArray = new Cell[numberOfCell];
    animalArray = new Cell[numberOfAnimal];
  }

  /**
   * I.S. sembarang
   * F.S. sama dengan I.S.
   * @return jumlah Habitat dalam suatu Cage
   */
  public int numberOfCell() {
    return cellArray.length;
  }

  /**
   * I.S. sembarang
   * F.S. sama dengan I.S.
   * @return jumlah Animal dalam suatu Cage
   */
  public int numberOfAnimal() {
    return animalArray.length;
  }

  /**
   * I.S. index di dalam range ukuran habitatArray
   * F.S. sama dengan I.S.
   * @param index Indeks Habitat yang ingin diakses
   * @return Habitat dengan indeks tertentu dalam habitatArray
   */
  public Cell getCellByIndex(int index) {
    return cellArray[index];
  }

  /**
   * I.S. index di dalam range ukuran habitatArray
   * F.S. suatu Habitat diisikan pada habitatArray
   * @param index Indeks Habitat yang ingin diubah
   * @param cell Habitat yang ingin diisikan
   */
  public void setCellByIndex(int index, Cell cell) {
    cellArray[index] = cell;
  }

  /**
   * I.S. index di dalam range ukuran animalArray
   * F.S. sama dengan I.S.
   * @param index Indeks Animal yang ingin diakses
   * @return Habitat dengan indeks tertentu dalam animalArray
   */
  public Cell getAnimalByIndex(int index) {
    return animalArray[index];
  }

  /**
   * I.S. index di dalam range ukuran animalArray
   * F.S. suatu Animal diisikan pada animalArray
   * @param index Indeks Animal yang ingin diubah
   * @param animal Animal yang ingin diisikan
   */
  public void setAnimalByIndex(int index, Cell animal) {
    animalArray[index] = animal;
  }

  /**
   * Mengembalikan indeks pada habitatArray yang elemennya mempunyai absis dan ordinat tertentu
   * I.S. sembarang
   * F.S. sama dengan I.S.
   * @param absis Absis dari Habitat yang dicari
   * @param ordinat Ordinat dari Habitat yang dicari
   * @return Indeks Habitat yang dicari pada habitatArray, -1 jika tidak ditemukan
   */
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

  /**
   * Mengembalikan indeks pada animalArray yang elemennya mempunyai absis dan ordinat tertentu
   * I.S. sembarang
   * F.S. sama dengan I.S.
   * @param absis Absis dari Animal yang dicari
   * @param ordinat Ordinat dari Animal yang dicari
   * @return Indeks Habitat yang dicari pada animalArray, -1 jika tidak ditemukan
   */
  public int getAnimalIndex(int absis, int ordinat) {
    int i = 0;
    boolean found = false;
    while (i < numberOfAnimal() && !found) {
      if (animalArray[i].getCellAbsis() == absis
          && animalArray[i].getCellOrdinat() == ordinat) {
        found = true;
      } else {
        i++;
      }
    }
    return (found) ? i : -1;
  }

  /**
   * I.S. jumlah Animal dalam Cage lebih besar dari 0
   * F.S. interaksi seluruh Animal dalam Cage tercetak di layar
   */
  public void wakeAnimalInCage() {
    for (int i = 0;i < numberOfAnimal();i++) {
      animalArray[i].interact();
    }
  }

  /**
   * I.S. jumlah Animal dalam Cage lebih besar dari 0
   * F.S. tercetak nama hewan serta koordinatnya di layar
   */
  public void showAnimalLocation() {
    for (int i = 0;i < numberOfAnimal();i++) {
      int absis = animalArray[i].getCellAbsis();
      int ordinat = animalArray[i].getCellOrdinat();
      System.out.println(animalArray[i].translateAnimalChar() + " di " + absis + " " + ordinat);
    }
  }

  /**
   * I.S. Cage sudah terisi Habitat dan Animal
   * F.S. throw exception atau sama dengan I.S.
   * @throws ZooException Kesalahan konfigurasi Zoo
   */
  public void validate() throws ZooException {
    int numberTamed = 0;
    for (int i = 0;i < numberOfAnimal();i++) {
      if (animalArray[i].getTamed()) {
        numberTamed++;
      }
    }
    int numberWild = numberOfAnimal() - numberTamed;
    if (numberTamed != numberOfAnimal() && numberWild != 1) {
      throw new ZooException(3);
    }
    for (int i = 0;i < numberOfAnimal();i++) {
      if (!animalArray[i].isAnimalHabitatMatch()) {
        throw new ZooException(3);
      }
    }
  }
}
