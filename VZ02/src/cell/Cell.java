/**
 * Cell merupakan petak petak pada Zoo
 */

package cell;

import zoo.Point;

/** @author Martin Lutta Putra (13515121).
 *
 *
 */
public class Cell {

  final int numberOfCellTypes = 11;
  private Point coordinate;
  private char animalChar;
  private int animalWeight;
  private boolean tamed;
  /** Daftar tipe tempat tinggal animal.
   *  animalNature[nomor] == true menyatakan memiliki nature yang bersangkutan
   *  0 land
   *  1 water
   *  2 air
   */
  private boolean[] animalNature = new boolean[3];

  /** Daftar tipe render cell.
   *  Jika cellType[nomor] = true, maka render akan menulis nama tipe
   *  0 restaurant
   *  1 road
   *  2 park
   *  3 entrance
   *  4 exit
   *  5 animal
   *  6 airhabitat
   *  7 waterhabitat
   *  8 landhabitat
   *  9 road_visited
   *  10 animal
   */
  private boolean[] cellType = new boolean[numberOfCellTypes];

  /**  Konstruktor kelas Cell
   * I.S. sembarang
   * F.S. coordinate tercipta
   * @param absis absis dari cell
   * @param ordinat ordinat dari cell
   */
  public Cell(int absis,int ordinat) {
    coordinate = new Point(absis,ordinat);
    for (int i = 0; i < cellType.length; i++) {
      cellType[i] = false;
    }
    animalChar = ' ';
    animalWeight = 0;
    tamed = false;
  }

  /**  I.S. sembarang
   * F.S. sama dengan I.S.
   * @return absis dari cell
   */
  public int getCellAbsis() {
    return coordinate.getAbsis();
  }

  /**  I.S. sembarang
   * F.S. sama dengan I.S.
   * @return ordinat dari cell
   */
  public int getCellOrdinat() {
    return coordinate.getOrdinat();
  }

  /**
   * I.S. sembarang
   * F.S. animalWeight terisi suatu nilai
   * @param weight Berat badan Animal
   */
  public void setAnimalWeight(int weight) {
    animalWeight = weight;
  }

  /** I.S. Sembarang
   * F.S. Sama dengan I.S
   */
  public boolean isInCage() {
    return (cellType[5] == true);
  }

  /** I.S. Sembarang
   * F.S. Sama dengan I.S
   */
  public boolean isHabitat() {
    return (cellType[6] == true || cellType[7] == true || cellType[8] == true);
  }


  /** I.S. Sembarang
   * F.S. Sama dengan I.S
   */
  public boolean isAnimalExist() {
    return (cellType[10] == true);
  }

  /** I.S. Sembarang
   * F.S. Sama dengan I.S
   */
  public boolean isRoadVisited() {
    return (cellType[9] == true);
  }

  /** I.S. Fungsi isAnimalExist() bernilai true
   * F.S. Mengisi animalChar dengan animalCharValue
   * @param animalCharValue Karakter yang merepresentasikan hewan yang menghuni Cell
   */
  public void setAnimalChar(char animalCharValue) {
    animalChar = animalCharValue;
  }

  /** I.S. Sembarang
   * F.S. Sama dengan I.S
   */
  public boolean[] getCellType() {
    return cellType;
  }

  /** I.S. Sembarang
   * F.S. Sama dengan I.S
   */
  public boolean getTamed() {
    return tamed;
  }

  /** I.S. Sembarang
   * F.S. tamed diisi dengan true atau false
   */
  public void setTamed(boolean tamed) {
    this.tamed = tamed;
  }

  /** I.S. Sembarang
   * F.S. cellType[idx] diisi true
   * @param idx Indeks cellType yang ingin diubah menjadi true
   */
  public void setCellType(int idx) {
    cellType[idx] = true;
  }

  /**  @see cell.Renderable#render().
   */

  public void render() {
    if (cellType[0] == true) {
      System.out.print("S");
    } else if (cellType[1] == true) {
      if (isRoadVisited()) {
        System.out.print("-");
      } else {
        System.out.print(" ");
      }
    } else if (cellType[2] == true) {
      System.out.print("P");
    } else if (cellType[3] == true) {
      System.out.print("E");
    } else if (cellType[4] == true) {
      System.out.print("B");
    } else if (cellType[6] == true) {
      if (isInCage()) {
        System.out.print("U");
      } else {
        System.out.print("u");
      }
    } else if (cellType[7] == true) {
      if (isInCage()) {
        System.out.print("A");
      } else {
        System.out.print("a");
      }
    } else if (cellType[8] == true) {
      if (isInCage()) {
        System.out.print("D");
      } else {
        System.out.print("d");
      }
    } else {
      System.out.print("#");
    }
  }

  /**
   * I.S. sembarang
   * F.S. interaksi hewan tercetak ke layar
   */
  public void interact() {
    if (animalChar == 'b') {
      System.out.println("*Kelelawar bergelantung terbalik*");
    } else if (animalChar == 'c') {
      System.out.println(
          "Burung cendrawasih sangat indah, tidak heran kalau mereka terancam punah");
    } else if (animalChar == 'h') {
      System.out.println("*Cheetah tidur siang*");
    } else if (animalChar == 'i') {
      System.out.println(
          "*Chimpanzee garuk-garuk punggung*");
    } else if (animalChar == 'r') {
      System.out.println("*Buaya sedang berjemur*");
    } else if (animalChar == 'd') {
      System.out.println("Ikan lumba-lumba melakukan dolphin jump ");
    } else if (animalChar == 'e') {
      System.out.println("*Tatapan burung elang kelihatan tajam sekali*");
    } else if (animalChar == 'f') {
      System.out.println("Webek Webek");
    } else if (animalChar == 'g') {
      System.out.println("*Gorilla menggedor kandang dan berusaha menerkam kamu*");
    } else if (animalChar == 'y') {
      System.out.println("*Hyena berjalan-jalan mengelilingi kandang*");
    } else if (animalChar == 'k') {
      System.out.println("Koala imut sekali <3");
    } else if (animalChar == 'o') {
      System.out.println("*Orangutan bergelayutan*");
    } else if (animalChar == 'l') {
      System.out.println("*Paruh kolibri sangat panjang, kerenn *");
    } else if (animalChar == 'n') {
      System.out.println("*Singa menyanyi lagu Lion King*");
    } else if (animalChar == 'm') {
      System.out.println("*Ikan pari bentuknya aneh sekali ... :| *");
    } else if (animalChar == 'r') {
      System.out.println("*Burung unta sedang mengubur kepalanya dalam tanah*");
    } else if (animalChar == 's') {
      System.out.println("*Penyu terlihat sangat tua");
    } else if (animalChar == 'p') {
      System.out.println("*Panda duduk sambil makan bambu*");
    } else if (animalChar == 't') {
      System.out.println("*AUMMMMMMMM*");
    } else if (animalChar == 'u') {
      System.out.println("*Burung merak memamerkan bulu indahnya*");
    } else if (animalChar == 'v') {
      System.out.println("*Komodo sangat menakutkan*");
    } else if (animalChar == 'q') {
      System.out.println("*Ikan paus hampir tidak muat di habitatnya*");
    } else if (animalChar == 'z') {
      System.out.println("*Kangguru minum extra joss agar kuat bertinju*");
    } else if (animalChar == 'x') {
      System.out.println("*Ikan hiu terlihat sangat mengintimidasi*");
    }
  }

  /**
   * I.S. animalChar tidak sama dengan ' '
   * F.S sama dengan I.S.
   * @return String hasil translasi animalChar
   */
  public String translateAnimalChar() {
    if (animalChar == 'b') {
      return "Kelelawar";
    } else if (animalChar == 'c') {
      return "Cendrawasih";
    } else if (animalChar == 'h') {
      return "Cheetah";
    } else if (animalChar == 'i') {
      return "Chimpanzee";
    } else if (animalChar == 'r') {
      return "Crocodile";
    } else if (animalChar == 'd') {
      return "Dolphin";
    } else if (animalChar == 'e') {
      return "Eagle";
    } else if (animalChar == 'f') {
      return "Frog";
    } else if (animalChar == 'g') {
      return "Gorilla";
    } else if (animalChar == 'y') {
      return "Hyena";
    } else if (animalChar == 'k') {
      return "Koala";
    } else if (animalChar == 'o') {
      return "Orangutan";
    } else if (animalChar == 'l') {
      return "Kolibri";
    } else if (animalChar == 'n') {
      return "Lion";
    } else if (animalChar == 'm') {
      return "Mantaray";
    } else if (animalChar == 'r') {
      return "Ostrich";
    } else if (animalChar == 's') {
      return "Seaturtle";
    } else if (animalChar == 'p') {
      return "Panda";
    } else if (animalChar == 't') {
      return "Tiger";
    } else if (animalChar == 'u') {
      return "Peacock";
    } else if (animalChar == 'v') {
      return "Komodo";
    } else if (animalChar == 'q') {
      return "Whale";
    } else if (animalChar == 'z') {
      return "Kangaroo";
    } else if (animalChar == 'x') {
      return "Shark";
    } else {
      return "";
    }
  }

  public boolean isAnimalHabitatMatch() {
    boolean air = getNatureByAnimalChar() == 6 && getCellType()[6];
    boolean water = getNatureByAnimalChar() == 7 && getCellType()[7];
    boolean land = getNatureByAnimalChar() == 8 && getCellType()[8];
    boolean landWater = getNatureByAnimalChar() == 9 && (getCellType()[7] || getCellType()[8]);
    return air || water || land || landWater;
  }

  /**
   * I.S. sembarang
   * F.S. sama dengan I.S.
   * @return 6 jika udara, 7 jika air, 8 jika darat, 9 jika air darat, 0 jika undefined
   */
  public int getNatureByAnimalChar() {
    if (animalChar == 'b' || animalChar == 'c' || animalChar == 'e' || animalChar == 'l') {
      return 6;
    } else if (animalChar == 'h' || animalChar == 'i' || animalChar == 'd' || animalChar == 'g'
        || animalChar == 'y' || animalChar == 'k' || animalChar == 'o' || animalChar == 'n'
        || animalChar == 'r' || animalChar == 'p' || animalChar == 'u' || animalChar == 'v'
        || animalChar == 'z' || animalChar == 't') {
      return 8;
    } else if (animalChar == 'm' || animalChar == 'e' || animalChar == 'q' || animalChar == 'x') {
      return 7;
    } else if (animalChar == 'r' || animalChar == 'f' || animalChar == 's') {
      return 9;
    } else {
      return 0;
    }
  }
}
