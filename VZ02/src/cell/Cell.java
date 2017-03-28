/**
 *
 */
package cell;

import zoo.Point;

/** @author Martin Lutta Putra (13515121).
 *
 *
 */
public class Cell {

	final int numberOfCellTypes = 34;
	private Point coordinate;
	private char animalChar;
/** Daftar tipe tempat tinggal animal
	 *  animalNature[nomor] == true menyatakan memiliki nature yang bersangkutan
	 *  0 land
	 *  1 water
	 *  2 air
	 */
	private boolean[] animalNature = new boolean[3];

	/** Daftar tipe render cell.
	 *  Jika cellType[nomor] = true, maka render akan menulis nama tipe
	 *
	 *  1 restaurant
	 *  2 road
	 *  3 park
	 *  4 entrance
	 *  5 exit
	 *  6 animal
	 *  7 airhabitat
	 *  8 waterhabitat
	 *  9 landhabitat
	 *  10 road_visited
	 *  11 bat
	 *  12 cendrawasih
	 *  13 cheetah
	 *  14 chimpanzee
	 *  15 crocodile
	 *  16 dolphin
	 *  17 eagle
	 *  18 frog
	 *  19 gorilla
	 *  20 hyena
	 *  21 kangaroo
	 *  22 koala
	 *  23 kolibri
	 *  24 komodo
	 *  25 lion
	 *  26 mantaray
	 *  27 orangutan
	 *  28 ostrich
	 *  29 panda
	 *  30 peacock
	 *  31 seaturtle
	 *  32 shark
	 *  33 tiger
	 *  34 whale
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
    for (int i = 0; i < 3; i++) {
    	animalNature[i] = false;
    }
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

  /** I.S. Fungsi isAnimalExist() bernilai true
   * F.S. Nature animal diisi land
   */
  public void setLandAnimal() {
  	animalNature[0] = true;
  }

  /** I.S. Fungsi isAnimalExist() bernilai true
   * F.S. Nature animal diisi water
   */
  public void setWaterAnimal() {
  	animalNature[1] = true;
  }

  /** I.S. Fungsi isAnimalExist() bernilai true
   * F.S. Nature animal diisi air
   */
  public void setAirAnimal() {
  	animalNature[2] = true;
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
    }
    else if (cellType[1] == true) {
    	if (isRoadVisited()) {
    		System.out.print("-");
    	}
    	else {
    		System.out.print(" ");
    	}
    }
    else if (cellType[2] == true) {
    	System.out.print("P");
    }
    else if (cellType[3] == true) {
    	System.out.print("E");
    }
    else if (cellType[4] == true) {
    	System.out.print("B");
    }
    else if (cellType[6] == true) {
    	if (isInCage()) {
    	  System.out.print("A");
    	}
    	else {
    		System.out.print("a");
    	}
    }
    else if (cellType[7] == true) {
    	if (isInCage()) {
    		System.out.print("W");
    	}
    	else {
    		System.out.print("w");
    	}
    }
    else if (cellType[8] == true) {
    	if (isInCage()) {
    		System.out.print("L");
    	}
    	else {
    		System.out.print("l");
    	}
    }
    else {
    	System.out.print("#");
    }
  }

  public void interact() {
  	if (animalChar == 'b') {
  		System.out.println("*Kelelawar bergelantung terbalik*");
  	}
  	else if (animalChar == 'c') {
  		System.out.println("Burung cendrawasih sangat indah, tidak heran kalau mereka terancam punah");
  	}
  	else if (animalChar == 'h') {
  		System.out.println("*Cheetah tidur siang*");
  	}
  	else if (animalChar == 'i') {
  		System.out.println("*Chimpanzee garuk-garuk punggung*");
  	}
  	else if (animalChar == 'r') {
  		System.out.println("*Buaya sedang berjemur*");
  	}
  	else if (animalChar == 'd') {
  		System.out.println("Ikan lumba-lumba melakukan dolphin jump ");
  	}
  	else if (animalChar == 'e') {
  		System.out.println("*Tatapan burung elang kelihatan tajam sekali*");
  	}
  	else if (animalChar == 'f') {
  		System.out.println("Webek Webek");
  	}
  	else if (animalChar == 'g') {
  		System.out.println("*Gorilla menggedor kandang dan berusaha menerkam kamu*");
  	}
  	else if (animalChar == 'y') {
  		System.out.println("*Hyena berjalan-jalan mengelilingi kandang*");
  	}
  	else if (animalChar == 'k') {
  		System.out.println("Koala imut sekali <3");
  	}
  	else if (animalChar == 'o') {
  		System.out.println("*Orangutan bergelayutan*");
  	}
  	else if (animalChar == 'l') {
  		System.out.println("*Paruh kolibri sangat panjang, kerenn *");
  	}
  	else if (animalChar == 'n') {
  		System.out.println("*Singa menyanyi lagu Lion King*");
  	}
  	else if (animalChar == 'm') {
  		System.out.println("*Ikan pari bentuknya aneh sekali ... :| *");
  	}
  	else if (animalChar == 'r') {
  		System.out.println("*Burung unta sedang mengubur kepalanya dalam tanah*");
  	}
  	else if (animalChar == 's') {
  		System.out.println("*Penyu terlihat sangat tua");
  	}
  	else if (animalChar == 'p') {
  		System.out.println("*Panda duduk sambil makan bambu*");
  	}
  	else if (animalChar == 't') {
  		System.out.println("*AUMMMMMMMM*");
  	}
  	else if (animalChar == 'u') {
  		System.out.println("*Burung merak memamerkan bulu indahnya*");
  	}
  	else if (animalChar == 'v') {
  		System.out.println("*Komodo sangat menakutkan*");
  	}
  	else if (animalChar == 'q') {
  		System.out.println("*Ikan paus hampir tidak muat di habitatnya*");
  	}
  	else if (animalChar == 'z') {
  		System.out.println("*Kangguru minum extra joss agar kuat bertinju*");
  	}
  	else if (animalChar == 'x') {
  		System.out.println("*Ikan hiu terlihat sangat mengintimidasi*");
  	}
  }
}
