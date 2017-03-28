/**
 * Main program untuk Virtual Zoo.
 */

import java.io.FileNotFoundException;

import java.io.IOException;

import java.util.Scanner;

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
      driver.initializeCage();

      int choice;
      Scanner scanner = new Scanner(System.in);
      driver.showMenu();
      System.out.print("Input: ");
      choice = scanner.nextInt();
      while (choice != 5) {
        switch (choice) {
          case 1:
            driver.showZooWithBoundary();
            break;
          case 2:
            driver.tourZoo();
            break;
          case 3:
            driver.showAnimalLocation();
            driver.moveAnimalInZoo();
            break;
          case 4:
            driver.showFoodAmount();
            break;
          default:
            System.out.println("Invalid input");
            break;
        }
        driver.showMenu();
        System.out.print("Input: ");
        choice = scanner.nextInt();
      }
      scanner.close();
    } catch (FileNotFoundException e) {
      System.out.println("File not found");
    } catch (IOException e) {
      System.out.println("IO error");
    } catch (ZooException e) {
      e.printError();
    }

  }
}
