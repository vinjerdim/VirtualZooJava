/**
 * Driver mengatur inisiasi dan interaksi program
 */

package zoo;

import cell.AirHabitat;
import cell.Entrance;
import cell.Exit;
import cell.LandHabitat;
import cell.Park;
import cell.Restaurant;
import cell.Road;
import cell.WaterHabitat;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Marvin Jerremy Budiman (13515076).
 *
 */

public class Driver {
  private FileParser parser;

  private Zoo zoo;

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
    } else {
      throw new ZooException(1);
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
        } else if (currentEntry.equals("#Entrance")) {
          zoo.setZooCell(column,row,new Entrance(column,row));
        } else if (currentEntry.equals("#Exit")) {
          zoo.setZooCell(column,row,new Exit(column,row));
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
   * Menampilkan Zoo di dalam range tertentu
   * I.S. batas-batas tidak melebihi column dan row pada zoo
   * F.S. tercetak penggambaran zoo di layar
   */
  public void showZoo(int upperBound, int lowerBound, int leftBound, int rightBound) throws ZooException {
    if (upperBound <= 0 || upperBound >= zoo.getZooRow()) {
      throw new ZooException(2);
    }
    if (lowerBound <= 0 || lowerBound >= zoo.getZooRow()) {
      throw new ZooException(2);
    }
    if (leftBound <= 0 || leftBound >= zoo.getZooColumn()) {
      throw new ZooException(2);
    }
    if (rightBound <= 0 || rightBound >= zoo.getZooRow()) {
      throw new ZooException(2);
    }
    for (int row = upperBound;row < lowerBound;row++) {
      for (int column = leftBound;column < rightBound;column++) {
        zoo.getZooCell(column, row).render();
      }
      System.out.println("");
    }
  }

  private boolean isValidRow(int row) {
    return
  }
}
