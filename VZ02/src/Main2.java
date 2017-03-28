/**
 * Main program untuk Virtual Zoo.
 */

import java.io.FileNotFoundException;

import java.io.IOException;

import zoo.Driver;

import zoo.ZooException;

/** @author Marvin Jerremy Budiman (13515076).
 */

public class Main2 {

  /** @param args Argumen untuk Main.
   */
  public static void main(String[] args) {
    try {
      Driver driver = new Driver("Zoo.txt");
      driver.initializeZoo();
      driver.initializeCage();
      driver.showZooWithBoundary(0,9,0,9);
 //     driver.showWholeZoo();
    } catch (FileNotFoundException e) {
      System.out.println("File not found");
    } catch (IOException e) {
      System.out.println("IO error");
    } catch (ZooException e) {
      e.printError();
    }

  }
}
