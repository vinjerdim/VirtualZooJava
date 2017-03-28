/**
 * Driver mengatur inisiasi dan interaksi program
 */

package zoo;

import java.io.*;
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
   * @param fileName nama file input
   * @throws FileNotFoundException file tidak ditemukan
   * @throws IOException IO error
   */
  public Driver(String fileName) throws FileNotFoundException,IOException, ZooException {
    parser = new FileParser(fileName);
    String currentString = parser.getString();
    if (currentString.equals("#Zoo")) {
      int column = parser.getNumber();
      int row = parser.getNumber();
      zoo = new Zoo(column,row);
    } else {
      throw new ZooException(1);
    }
  }
/*
  public void initializeZoo() throws IOException {
    String currentString = parser.getString();
    while () {

    }
  }
  */
}
