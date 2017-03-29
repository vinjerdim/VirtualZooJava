/**
 * Driver mengatur inisiasi dan interaksi program
 */

package zoo;

import animal.Consumption;

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

  /**
   * I.S. Objek Driver sudah terbentuk
   * F.S. cageArray terisi dengan cell yang berupa Habitat dan Animal
   * @throws IOException IO error
   * @throws ZooException Zoo configuration error
   */
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
          tempAnimal.setCellType(10);
          int weight = parser.getNumber();
          if (animal.equals("#Bat")) {
            Consumption.addMeatAmount(weight * 0.25);
            tempAnimal.setAnimalChar('b');
            tempAnimal.setTamed(true);
          } else if (animal.equals("#Cendrawasih")) {
            Consumption.addMeatAmount(weight * 0.25);
            Consumption.addVegetableAmount(weight * 0.25);
            tempAnimal.setAnimalChar('c');
            tempAnimal.setTamed(true);
          } else if (animal.equals("#Cheetah")) {
            Consumption.addMeatAmount(weight * 0.25);
            tempAnimal.setAnimalChar('h');
            tempAnimal.setTamed(false);
          } else if (animal.equals("#Chimpanzee")) {
            Consumption.addMeatAmount(weight * 0.25);
            Consumption.addVegetableAmount(weight * 0.25);
            tempAnimal.setAnimalChar('i');
            tempAnimal.setTamed(true);
          } else if (animal.equals("#Crocodile")) {
            Consumption.addMeatAmount(weight * 0.25);
            tempAnimal.setAnimalChar('r');
            tempAnimal.setTamed(false);
          } else if (animal.equals("#Dolphin")) {
            Consumption.addMeatAmount(weight * 0.25);
            tempAnimal.setAnimalChar('d');
            tempAnimal.setTamed(true);
          } else if (animal.equals("#Eagle")) {
            Consumption.addMeatAmount(weight * 0.25);
            tempAnimal.setAnimalChar('e');
            tempAnimal.setTamed(false);
          } else if (animal.equals("#Frog")) {
            Consumption.addMeatAmount(weight * 0.25);
            tempAnimal.setAnimalChar('f');
            tempAnimal.setTamed(true);
          } else if (animal.equals("#Gorilla")) {
            Consumption.addMeatAmount(weight * 0.25);
            Consumption.addVegetableAmount(weight * 0.25);
            tempAnimal.setAnimalChar('g');
            tempAnimal.setTamed(false);
          } else if (animal.equals("#Hyena")) {
            Consumption.addMeatAmount(weight * 0.25);
            tempAnimal.setAnimalChar('y');
            tempAnimal.setTamed(false);
          } else if (animal.equals("#Kangaroo")) {
            Consumption.addVegetableAmount(weight * 0.25);
            tempAnimal.setAnimalChar('z');
            tempAnimal.setTamed(false);
          } else if (animal.equals("#Koala")) {
            Consumption.addVegetableAmount(weight * 0.25);
            tempAnimal.setAnimalChar('k');
            tempAnimal.setTamed(true);
          } else if (animal.equals("#Kolibri")) {
            Consumption.addMeatAmount(weight * 0.25);
            Consumption.addVegetableAmount(weight * 0.25);
            tempAnimal.setAnimalChar('l');
            tempAnimal.setTamed(true);
          } else if (animal.equals("#Komodo")) {
            Consumption.addMeatAmount(weight * 0.25);
            tempAnimal.setAnimalChar('v');
            tempAnimal.setTamed(false);
          } else if (animal.equals("#Lion")) {
            Consumption.addMeatAmount(weight * 0.25);
            tempAnimal.setAnimalChar('n');
            tempAnimal.setTamed(false);
          } else if (animal.equals("#Mantaray")) {
            Consumption.addMeatAmount(weight * 0.25);
            tempAnimal.setAnimalChar('m');
            tempAnimal.setTamed(true);
          } else if (animal.equals("#Orangutan")) {
            Consumption.addMeatAmount(weight * 0.25);
            Consumption.addVegetableAmount(weight * 0.25);
            tempAnimal.setAnimalChar('o');
            tempAnimal.setTamed(true);
          } else if (animal.equals("#Ostrich")) {
            Consumption.addVegetableAmount(weight * 0.25);
            tempAnimal.setAnimalChar('r');
            tempAnimal.setTamed(true);
          } else if (animal.equals("#Panda")) {
            Consumption.addVegetableAmount(weight * 0.25);
            tempAnimal.setAnimalChar('p');
            tempAnimal.setTamed(true);
          } else if (animal.equals("#Peacock")) {
            Consumption.addVegetableAmount(weight * 0.25);
            tempAnimal.setAnimalChar('u');
            tempAnimal.setTamed(true);
          } else if (animal.equals("#Seaturtle")) {
            Consumption.addMeatAmount(weight * 0.25);
            tempAnimal.setAnimalChar('s');
            tempAnimal.setTamed(true);
          } else if (animal.equals("#Shark")) {
            Consumption.addMeatAmount(weight * 0.25);
            tempAnimal.setAnimalChar('x');
            tempAnimal.setTamed(false);
          } else if (animal.equals("#Tiger")) {
            Consumption.addMeatAmount(weight * 0.25);
            tempAnimal.setAnimalChar('t');
            tempAnimal.setTamed(false);
          } else if (animal.equals("#Whale")) {
            Consumption.addMeatAmount(weight * 0.25);
            tempAnimal.setAnimalChar('q');
            tempAnimal.setTamed(true);
          } else {
            throw new ZooException(1);
          }
          tempAnimal.setAnimalWeight(weight);
          cageArray.getCageByIndex(indexCage).setAnimalByIndex(indexAnimal, tempAnimal);
          indexAnimal++;
        }

        temp = parser.getChar();
        parser.getChar();
      }
      currentString = parser.getString();
      if (currentString.equals("#")) {
        break;
      } else {
        indexCage++;
      }
    }
  }

  /**
   * I.S. sembarang
   * F.S. Jumlah sayur dan daging untuk konsumsi Zoo tercetak ke layar
   */
  public void showFoodAmount() {
    System.out.println("Jumlah sayur = " + Consumption.getVegetableAmount() + " kg");
    System.out.println("Jumlah daging = " + Consumption.getMeatAmount() + " kg");
  }

  /**
   * I.S. sembarang
   * F.S. Menampilkan hewan beserta lokasi nya dalam Zoo
   */
  public void showAnimalLocation() {
    for (int i = 0;i < cageArray.numberOfCage();i++) {
      cageArray.getCageByIndex(i).showAnimalLocation();
    }
  }

  /**
   *  I.S. cageArray sudah terinisiasi
   *  F.S. throw exception atau sama dengan I.S.
   * @throws ZooException Konfigurasi Zoo error
   */
  public void validateCage() throws ZooException {
    for (int i = 0;i < cageArray.numberOfCage();i++) {
      cageArray.getCageByIndex(i).validate();
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
