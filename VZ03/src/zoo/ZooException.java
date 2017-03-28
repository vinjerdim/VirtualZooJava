/**
 * ZooException menangani error khusus di aplikasi VirutalZoo
 */

package zoo;

/**
 * @author Marvin Jerremy Budiman (13515076).
 *
 */
public class ZooException extends Exception {
  private int errorNumber;

  /**
   * Konstruktor kelas ZooException.
   * I.S. sembarang
   * F.S. errorNumber terisi
   * @param errorNumber Kategori error
   */
  public ZooException(int errorNumber) {
    this.errorNumber = errorNumber;
  }

  /**
   * I.S. sembarang
   * F.S. sama dengan I.S.
   * @return errorNumber
   */
  public int getErrorNumber() {
    return errorNumber;
  }

  public void printError() {
    switch (errorNumber) {
      case 1:
        System.out.println("File format error");break;
      default:
        System.out.println("An error occured");
    }
  }
}