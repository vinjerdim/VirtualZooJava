/**
 * Main program untuk Virtual Zoo.
 */

import java.io.FileNotFoundException;

import java.io.IOException;

import zoo.Driver;

import zoo.ZooException;

/** @author Marvin Jerremy Budiman (13515076).
 */

public class Main {

  /** @param args Argumen untuk Main.
   */
  public static void main(String[] args) {
    try {
      Driver driver = new Driver("res/Zoo.txt");
      driver.initializeZoo();
      driver.showZoo(0,);
    } catch (FileNotFoundException e) {
      System.out.println("File not found");
    } catch (IOException e) {
      System.out.println("IO error");
    } catch (ZooException e) {
      e.printError();
    }

  }
}
