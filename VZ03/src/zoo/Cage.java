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

  /**
   * Konstruktor kelas Cage
   * I.S. sembarang
   * F.S. habitatArray dan animalArray dialokasi
   * @param numberOfHabitat jumlah Habitat dalam suatu Cage
   * @param numberOfAnimal jumlah Hewan dalam suatu Cage
   */
  public Cage(int numberOfHabitat,int numberOfAnimal) {
    habitatArray = new Habitat[numberOfHabitat];
    animalArray = new Animal[numberOfAnimal];
  }

  /**
   * I.S. sembarang
   * F.S. sama dengan I.S.
   * @return jumlah Habitat dalam suatu Cage
   */
  public int numberOfHabitat() {
    return habitatArray.length;
  }

  /**
   * I.S. sembarang
   * F.S. sama dengan I.S.
   * @return jumlah Hewan dalam suatu Cage
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
  public Habitat getHabitatByIndex(int index) {
    return habitatArray[index];
  }

  /**
   * I.S. index di dalam range ukuran habitatArray
   * F.S. suatu Habitat diisikan pada habitatArray
   * @param index Indeks Habitat yang ingin diubah
   * @param habitat Habitat yang ingin diisikan
   */
  public void setHabitatByIndex(int index, Habitat habitat) {
    habitatArray[index] = habitat;
  }

  /**
   * I.S. index di dalam range ukuran animalArray
   * F.S. sama dengan I.S.
   * @param index Indeks Animal yang ingin diakses
   * @return Habitat dengan indeks tertentu dalam animalArray
   */
  public Animal getAnimalByIndex(int index) {
    return animalArray[index];
  }

  /**
   * I.S. index di dalam range ukuran animalArray
   * F.S. suatu Animal diisikan pada animalArray
   * @param index Indeks Animal yang ingin diubah
   * @param animal Animal yang ingin diisikan
   */
  public void setAnimalByIndex(int index, Animal animal) {
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
      int absis = animalArray[i].getAnimalAbsis();
      int ordinat = animalArray[i].getAnimalOrdinat();
      System.out.println(animalArray[i].getClass().getName().substring(7)
          + " di " + absis + " " + ordinat);
    }
  }
}
