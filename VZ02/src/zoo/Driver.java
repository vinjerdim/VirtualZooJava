/**
 * Driver mengatur inisiasi dan interaksi program
 */

package zoo;

import cell.Cell;

import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Scanner;

/** @author Martin Lutta Putra (13515121).
 *
 */
public class Driver {
  private FileParser parser;
  private Zoo zoo;
  private CageArray cageArray;

  /**
   * Konstruktor kelas Driver
   * I.S. file bernama fileName berada di direktori yang sama
   * F.S. objek FileInputStream tercipta
   * @param filePath nama file input
   * @throws FileNotFoundException file tidak ditemukan
   * @throws IOException IO error
   */
  public Driver(String filePath) throws FileNotFoundException,IOException, ZooException {
    parser = new FileParser(filePath);
    String currentString = parser.getString();
    if (currentString.equals("#Zoo")) {
      int column = parser.getNumber();
      int row = parser.getNumber();
      zoo = new Zoo(column,row);
      currentString = parser.getString();
      if (!currentString.equals("#Cage")) {
        throw new ZooException(1);
      }
      int numberOfCage = parser.getNumber();
      cageArray = new CageArray(numberOfCage);
    } else {
      throw new ZooException(1);
    }
  }

  /**
   * I.S. sembarang
   * F.S. menu utama tercetak di layar
   */
  public void showMenu() {
    System.out.println("Virtual Zoo");
    System.out.println("1. Show Virtual Zoo");
    System.out.println("2. Tour Virtual Zoo");
    System.out.println("3. Show Animal in Virtual Zoo");
    System.out.println("4. Show Food in Virtual Zoo");
    System.out.println("5. Exit");
  }

  /**
   * Menampilkan Zoo di dalam range tertentu
   * I.S. sembarang
   * F.S. tercetak penggambaran zoo di layar
   */
  public void showZooWithBoundary() throws ZooException {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Batas atas: ");
    int upperBound = scanner.nextInt();
    System.out.print("Batas bawah: ");
    int lowerBound = scanner.nextInt();
    if (!isValidRow(upperBound) || !isValidRow(lowerBound) || upperBound > lowerBound) {
      scanner.close();
      throw new ZooException(2);
    }

    System.out.print("Batas kiri: ");
    int leftBound = scanner.nextInt();
    System.out.print("Batas kanan: ");
    int rightBound = scanner.nextInt();
    if (!isValidColumn(leftBound) || !isValidColumn(rightBound) || leftBound > rightBound) {
      scanner.close();
      throw new ZooException(2);
    }
    for (int row = upperBound;row <= lowerBound;row++) {
      for (int column = leftBound;column <= rightBound;column++) {
        zoo.getZooCell(column, row).render();
      }
      System.out.println("");
    }
    scanner.close();
  }

  /**
   * Menampilkan keseluruhan Zoo
   * I.S. sembarang
   * F.S. tercetak penggambaran zoo di layar
   */
  public void showWholeZoo() {
    for (int row = 0;row < zoo.getZooRow();row++) {
      for (int column = 0;column < zoo.getZooColumn();column++) {
        zoo.getZooCell(column, row).render();
      }
      System.out.println("");
    }
  }

  /**
   * I.S. Objek Driver sudah terbentuk
   * F.S. zoo terisi dengan cell yang berupa Habitat atau Facility
   * @throws IOException IO error
   * @throws ZooException Zoo configuration error
   */
  public void initializeZoo() throws IOException, ZooException {
    String currentString = parser.getString();
    if (!(currentString.equals("#ZooEntry"))) {
      throw new ZooException(1);
    }
    while (currentString.equals("#ZooEntry")) {
      String currentEntry = parser.getString();

      while (!(currentEntry.equals("#"))) {
        int column = parser.getNumber();
        int row = parser.getNumber();

        zoo.setZooCell(column, row, new Cell(column, row));

        if (currentEntry.equals("#LandHabitat")) {
          zoo.getZooCell(column, row).setCellType(8);
        } else if (currentEntry.equals("#WaterHabitat")) {
        	zoo.getZooCell(column, row).setCellType(7);
        } else if (currentEntry.equals("#AirHabitat")) {
        	zoo.getZooCell(column, row).setCellType(6);
        } else if (currentEntry.equals("#Park")) {
        	zoo.getZooCell(column, row).setCellType(2);
        } else if (currentEntry.equals("#Restaurant")) {
        	zoo.getZooCell(column, row).setCellType(0);
        } else if (currentEntry.equals("#Road")) {
        	zoo.getZooCell(column, row).setCellType(1);
        } else if (currentEntry.equals("#Entrance")) {
        	zoo.getZooCell(column, row).setCellType(3);
        } else if (currentEntry.equals("#Exit")) {
        	zoo.getZooCell(column, row).setCellType(4);
        } else {
          throw new ZooException(1);
        }

        char temp = parser.getChar();
        if (temp == '>') {
          parser.getChar();
        } else if (temp == '@') {
          parser.getChar();
          currentEntry = "#";
        }
      }
      currentString = parser.getString();
      if (currentString.equals("#")) {
        break;
      }
    }
  }

  public void initializeCage() throws IOException, ZooException {
    String currentString = parser.getString();
    if (!(currentString.equals("#CageEntry"))) {
      throw new ZooException(1);
    }
    int indexCage = 0;
    while (currentString.equals("#CageEntry")) {
      int numberOfHabitat = parser.getNumber();
      int numberOfAnimal = parser.getNumber();
      if (numberOfAnimal > 3 * numberOfHabitat / 10) {
        throw new ZooException(3);
      }
      cageArray.setCageByIndex(indexCage, new Cage(numberOfHabitat,numberOfAnimal));

      int indexHabitat = 0;
      int indexAnimal = 0;
      String currentEntry = parser.getString();
      if (!(currentEntry.equals("#Habitat"))) {
        throw new ZooException(3);
      }
      char temp = '>';
      while (temp != '@') {
        int column = parser.getNumber();
        int row = parser.getNumber();

        if (!(zoo.getZooCell(column, row).isHabitat())) {
          throw new ZooException(3);
        }
        Cell tempHabitat = zoo.getZooCell(column, row);
        tempHabitat.setCellType(5);
        cageArray.getCageByIndex(indexCage).setCellByIndex(indexHabitat, tempHabitat);
        indexHabitat++;

        String animal = parser.getString();
        if (!animal.equals("#None")) {
        	zoo.getZooCell(column, row).setCellType(10);
          Cell tempAnimal = zoo.getZooCell(column, row);
        	int weight = parser.getNumber();
          if (animal.equals("#Bat")) {
            tempAnimal.setAnimalChar('b');
          } else if (animal.equals("#Cendrawasih")) {
            tempAnimal.setAnimalChar('c');
          } else if (animal.equals("#Cheetah")) {
            tempAnimal.setAnimalChar('h');
          } else if (animal.equals("#Chimpanzee")) {
            tempAnimal.setAnimalChar('i');
          } else if (animal.equals("#Crocodile")) {
            tempAnimal.setAnimalChar('r');
          } else if (animal.equals("#Dolphin")) {
            tempAnimal.setAnimalChar('d');
          } else if (animal.equals("#Eagle")) {
            tempAnimal.setAnimalChar('e');
          } else if (animal.equals("#Frog")) {
            tempAnimal.setAnimalChar('f');
          } else if (animal.equals("#Gorilla")) {
            tempAnimal.setAnimalChar('g');
          } else if (animal.equals("#Hyena")) {
            tempAnimal.setAnimalChar('y');
          } else if (animal.equals("#Kangaroo")) {
            tempAnimal.setAnimalChar('z');
          } else if (animal.equals("#Koala")) {
            tempAnimal.setAnimalChar('k');
          } else if (animal.equals("#Kolibri")) {
            tempAnimal.setAnimalChar('l');
          } else if (animal.equals("#Komodo")) {
            tempAnimal.setAnimalChar('v');
          } else if (animal.equals("#Lion")) {
            tempAnimal.setAnimalChar('n');
          } else if (animal.equals("#Mantaray")) {
            tempAnimal.setAnimalChar('m');
          } else if (animal.equals("#Orangutan")) {
            tempAnimal.setAnimalChar('o');
          } else if (animal.equals("#Ostrich")) {
            tempAnimal.setAnimalChar('r');
          } else if (animal.equals("#Panda")) {
            tempAnimal.setAnimalChar('p');
          } else if (animal.equals("#Peacock")) {
            tempAnimal.setAnimalChar('u');
          } else if (animal.equals("#Seaturtle")) {
            tempAnimal.setAnimalChar('s');
          } else if (animal.equals("#Shark")) {
            tempAnimal.setAnimalChar('x');
          } else if (animal.equals("#Tiger")) {
            tempAnimal.setAnimalChar('t');
          } else if (animal.equals("#Whale")) {
            tempAnimal.setAnimalChar('q');
          }
          cageArray.getCageByIndex(indexCage).setAnimalByIndex(indexAnimal, tempAnimal);
          indexAnimal++;
        } else if (animal.equals("#None")) {

        } else {
          throw new ZooException(1);
        }

        temp = parser.getChar();
        parser.getChar();
      }
      currentString = parser.getString();
      if (currentString.equals("#")) {
        break;
      }
    }
  }

  /**
   * I.S. sembarang
   * F.S. sama dengan I.S.
   * @param row nilai baris yang akan diperiksa
   * @return true jika tidak diluar nomor baris Zoo
   */
  private boolean isValidRow(int row) {
    return (row >= 0 && row < zoo.getZooRow());
  }

  /**
   * I.S. sembarang
   * F.S. sama dengan I.S.
   * @param column nilai kolom yang akan diperiksa
   * @return true jika tidak diluar nomor kolom Zoo
   */
  private boolean isValidColumn(int column) {
    return (column >= 0 && column < zoo.getZooColumn());
  }
}
