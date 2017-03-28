/**
 * FileParser menangani pengambilan input dari file eksternal
 */

package zoo;

import java.io.*;

/**
 * @author Marvin Jerremy Budiman (13515076).
 *
 */
public class FileParser {
  private FileInputStream fileInput;

  /**
   * Konstruktor kelas FileParser.
   * I.S. file bernama fileName berada di direktori yang sama
   * F.S. objek FileInputStream tercipta
   * @param fileName nama file input
   * @throws FileNotFoundException file tidak ditemukan
   */
  public FileParser(String fileName) throws FileNotFoundException {
    fileInput = new FileInputStream(fileName);
  }

  /**
   * I.S.sembarang
   * F.S. sama dengan I.S.
   * @return String hasil parsing
   * @throws IOException IO error
   */
  public String getString() throws IOException {
    boolean endOfLine = false;
    String string = "";
    char bufferChar;
    while (!endOfLine) {
      bufferChar = (char)fileInput.read();
      if (bufferChar != '\n') {
        string += bufferChar;
      } else {
        endOfLine = true;
      }
    }
    return string;
  }

  /**
   * I.S.sembarang
   * F.S. sama dengan I.S.
   * @return bilangan hasil parsing
   * @throws IOException IO error
   */
  public int getNumber() throws IOException {
    boolean endOfLine = false;
    int sum = 0;
    int bufferChar;
    while (!endOfLine) {
      bufferChar = fileInput.read();
      if ((char)bufferChar != '\n' && (char)bufferChar != ' ') {
        sum *= 10;
        sum += bufferChar - (int)'0';
      } else {
        endOfLine = true;
      }
    }
    return sum;
  }

  public void close() throws IOException {
    fileInput.close();
  }
}
