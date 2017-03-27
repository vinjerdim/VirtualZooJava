/**  Nature menyimpan informasi nature (land, water, atau air) dari suatu Habitat atau Animal
 */

package animal;

/** @author Marvin Jerremy Budiman (13515076).
 */

public class Nature {
  /** status menyimpan informasi nature dari suatu Habitat atau Animal.<br>
    * status[0] bernilai true jika nature-nya land<br>
    * status[1] bernilai true jika nature-nya water<br>
    * status[2] bernilai true jika nature-nya air<br>
    */
  private boolean status[] = new boolean[3];

  /** Konstruktor kelas HabitatStatus<br>
    * Menginisiasi isi status menjadi false saat penciptaan HabitatStatus<br>
    * I.S. sembarang<br>
    * F.S. seluruh isi status bernilai false<br>
    */
  public Nature() {
    for (int i = 0;i < 3;i++) {
      status[i] = false;
    }
  }

  /**  I.S. semua elemen status bernilai false
   * F.S. nilai elemen status berubah sesuai parameter land, water, air
   * @param land bernilai true jika nature-nya land
   * @param water bernilai true jika nature-nya water
   * @param air bernilai true jika nature-nya air
   */
  public void setStatus(boolean land, boolean water, boolean air) {
    if (land) {
      status[0] = true;
    }
    if (water) {
      status[1] = true;
    }
    if (air) {
      status[2] = true;
    }
  }

  /** I.S. sembarang<br>
    * F.S. sama dengan I.S.<br>
    * @return status dari Nature
    */
  public boolean[] getStatus() {
    return status;
  }

  /** Mengecek apakah Nature suatu Habitat cocok dengan Nature suatu Animal<br>
    * I.S. current objek merupakan Nature dari suatu Habitat<br>
    * F.S. sama dengan I.S.<br>
    * @param animalNature Nature dari suatu Animal
    * @return bernilai true jika animal_nature cocok dengan Nature current objek<br>
    */
  public boolean isNatureMatch(Nature animalNature) {
    int i = 0;
    boolean match = true;
    while (i < 3 && match) {
      if (status[i] == true && status[i] != animalNature.status[i]) {
        match = false;
      } else {
        i++;
      }
    }
    return match;
  }
}