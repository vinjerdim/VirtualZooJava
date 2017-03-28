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

  /**
   * Konstruktor kelas CageArray
   * I.S. sembarang
   * F.S. cageArray dialokasi
   * @param numberOfCage Jumlah Cage dalam suatu CageArray
   */
  public CageArray(int numberOfCage) {
    cageArray = new Cage[numberOfCage];
  }

  /**
   * I.S. sembarang
   * F.S. sama dengan I.S.
   * @return Jumlah Cage dalam CageArray
   */
  public int numberOfCage() {
    return cageArray.length;
  }

  /**
   * I.S. index di dalam range ukuran cageArray
   * F.S. sama dengan I.S.
   * @param index Indeks Cage yang ingin diakses
   * @return Cage dengan indeks tertentu dalam cageArray
   */
  public Cage getCageByIndex(int index) {
    return cageArray[index];
  }

  /**
   * I.S. index di dalam range ukuran cageArray
   * F.S. suatu Cage diisikan pada cageArray
   * @param index Indeks Cage yang ingin diubah
   * @param cage Cage yang ingin diisikan
   */
  public void setCageByIndex(int index, Cage cage) {
    cageArray[index] = cage;
  }

  /**
   * I.S. indexCage di dalam range ukuran cageArray, indexHabitat di dalam range ukuran habitatArray
   * F.S. suatu Habitat diisikan pada suatu Cage dalam cageArray
   * @param indexCage Indeks Cage yang ingin diisi
   * @param indexHabitat indeks Habitat yang ingin diubah
   * @param habitat Habitat yang ingin diisikan
   */
  public void setHabitatByIndex(int indexCage, int indexHabitat, Habitat habitat) {
    cageArray[indexCage].setHabitatByIndex(indexHabitat, habitat);
  }

  /**
   * I.S. indexCage di dalam range ukuran cageArray, indexAnimal di dalam range ukuran animalArray
   * F.S. suatu Animal diisikan pada suatu Cage dalam cageArray
   * @param indexCage Indeks Cage yang ingin diisi
   * @param indexAnimal indeks Animal yang ingin diubah
   * @param animal Animal yang ingin diisikan
   */
  public void setAnimalByIndex(int indexCage, int indexAnimal, Animal animal) {
    cageArray[indexCage].setAnimalByIndex(indexAnimal, animal);
  }

  /**
   * Mengembalikan indeks pada CageArray yang elemennya memiliki Habitat
   * dengan absis dan ordinat tertentu
   * I.S. sembarang
   * F.S. sama dengan I.S.
   * @param absis Absis dari Habitat yang dicari
   * @param ordinat Ordinat dari Habitat yang dicari
   * @return Indeks Cage yang dicari pada CageArray, -1 jika tidak ditemukan
   */
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
