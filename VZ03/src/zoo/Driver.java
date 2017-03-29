/**
 * Driver mengatur inisiasi dan interaksi program
 */

package zoo;

import animal.*;

import cell.AirHabitat;
import cell.Entrance;
import cell.Exit;
import cell.Habitat;
import cell.LandHabitat;
import cell.Park;
import cell.Restaurant;
import cell.Road;
import cell.WaterHabitat;

import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Marvin Jerremy Budiman (13515076).
 *
 */

public class Driver {
  private FileParser parser;
  private Zoo zoo;
  private CageArray cageArray;
  private Path zooPath;

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
      zooPath = new Path();
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
   * I.S. batas-batas tidak melebihi column dan row pada zoo
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

      char temp = '>';
      while (temp != '@') {
        int column = parser.getNumber();
        int row = parser.getNumber();

        if (currentEntry.equals("#LandHabitat")) {
          zoo.setZooCell(column,row,new LandHabitat(column,row));
        } else if (currentEntry.equals("#WaterHabitat")) {
          zoo.setZooCell(column,row,new WaterHabitat(column,row));
        } else if (currentEntry.equals("#AirHabitat")) {
          zoo.setZooCell(column,row,new AirHabitat(column,row));
        } else if (currentEntry.equals("#Park")) {
          zoo.setZooCell(column,row,new Park(column,row));
        } else if (currentEntry.equals("#Restaurant")) {
          zoo.setZooCell(column,row,new Restaurant(column,row));
        } else if (currentEntry.equals("#Road")) {
          zoo.setZooCell(column,row,new Road(column,row));
          zooPath.addRoad((Road)zoo.getZooCell(column, row));
        } else if (currentEntry.equals("#Entrance")) {
          zoo.setZooCell(column,row,new Entrance(column,row));
          zooPath.addEntrance((Entrance)zoo.getZooCell(column, row));
          zooPath.addRoad((Road)zoo.getZooCell(column, row));
        } else if (currentEntry.equals("#Exit")) {
          zoo.setZooCell(column,row,new Exit(column,row));
          zooPath.addRoad((Road)zoo.getZooCell(column, row));
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

        if (!(zoo.getZooCell(column, row) instanceof Habitat)) {
          throw new ZooException(3);
        }
        Habitat tempHabitat = (Habitat)zoo.getZooCell(column, row);
        tempHabitat.setInCage(true);
        cageArray.setHabitatByIndex(indexCage, indexHabitat, tempHabitat);
        indexHabitat++;

        String animal = parser.getString();
        if (!animal.equals("#None")) {
          int weight = parser.getNumber();
          Animal tempAnimal = null;
          if (animal.equals("#Bat")) {
            tempAnimal = new Bat(weight,column,row);
          } else if (animal.equals("#Cendrawasih")) {
            tempAnimal = new Cendrawasih(weight,column,row);
          } else if (animal.equals("#Cheetah")) {
            tempAnimal = new Cheetah(weight,column,row);
          } else if (animal.equals("#Chimpanzee")) {
            tempAnimal = new Chimpanzee(weight,column,row);
          } else if (animal.equals("#Crocodile")) {
            tempAnimal = new Crocodile(weight,column,row);
          } else if (animal.equals("#Dolphin")) {
            tempAnimal = new Dolphin(weight,column,row);
          } else if (animal.equals("#Eagle")) {
            tempAnimal = new Eagle(weight,column,row);
          } else if (animal.equals("#Frog")) {
            tempAnimal = new Frog(weight,column,row);
          } else if (animal.equals("#Gorilla")) {
            tempAnimal = new Gorilla(weight,column,row);
          } else if (animal.equals("#Hyena")) {
            tempAnimal = new Hyena(weight,column,row);
          } else if (animal.equals("#Kangaroo")) {
            tempAnimal = new Kangaroo(weight,column,row);
          } else if (animal.equals("#Koala")) {
            tempAnimal = new Koala(weight,column,row);
          } else if (animal.equals("#Kolibri")) {
            tempAnimal = new Kolibri(weight,column,row);
          } else if (animal.equals("#Komodo")) {
            tempAnimal = new Komodo(weight,column,row);
          } else if (animal.equals("#Lion")) {
            tempAnimal = new Lion(weight,column,row);
          } else if (animal.equals("#Mantaray")) {
            tempAnimal = new Mantaray(weight,column,row);
          } else if (animal.equals("#Orangutan")) {
            tempAnimal = new Orangutan(weight,column,row);
          } else if (animal.equals("#Ostrich")) {
            tempAnimal = new Ostrich(weight,column,row);
          } else if (animal.equals("#Panda")) {
            tempAnimal = new Panda(weight,column,row);
          } else if (animal.equals("#Peacock")) {
            tempAnimal = new Peacock(weight,column,row);
          } else if (animal.equals("#Seaturtle")) {
            tempAnimal = new Seaturtle(weight,column,row);
          } else if (animal.equals("#Shark")) {
            tempAnimal = new Shark(weight,column,row);
          } else if (animal.equals("#Tiger")) {
            tempAnimal = new Tiger(weight,column,row);
          } else if (animal.equals("#Whale")) {
            tempAnimal = new Whale(weight,column,row);
          } else {
            throw new ZooException(1);
          }
          cageArray.setAnimalByIndex(indexCage, indexAnimal, tempAnimal);
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
   * I.S. jumlah entrance pada Zoo lebih besar dari 0
   * F.S. tercetak koordinat beserta interaksi hewan di layar selama tur
   */
  public void tourZoo() {
    zooPath.setAllUnvisited();
    Random rand = new Random();
    int randomNumber = rand.nextInt(zooPath.numberOfEntrance());
    zooPath.setCurrentRoad(zooPath.getEntranceByIndex(randomNumber));
    while (!zooPath.getNextRoad().equals(zooPath.getCurrentRoad())) {
      int absis = zooPath.getCurrentRoad().getCellAbsis();
      int ordinat = zooPath.getCurrentRoad().getCellOrdinat();
      System.out.println(absis + " " + ordinat);
      int[] index = {cageArray.getCageIndex(absis + 1, ordinat),
          cageArray.getCageIndex(absis, ordinat + 1),
          cageArray.getCageIndex(absis - 1, ordinat),
          cageArray.getCageIndex(absis, ordinat - 1)};
      for (int i = 0;i < 4;i++) {
        if (index[i] != -1) {
          if (cageArray.getCageByIndex(index[i]).numberOfAnimal() > 0) {
            cageArray.getCageByIndex(index[i]).wakeAnimalInCage();
          }
        }
      }
      zooPath.getCurrentRoad().setVisited(true);
      zooPath.setCurrentRoad(zooPath.getNextRoad());
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
   * I.S. numberOfCage lebih besar dari 0
   * F.S. coordinate setiap Animal dalam Zoo tetap sama atau berubah
   */
  public void moveAnimalInZoo() {
    cageArray.moveAnimalInCage();
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
