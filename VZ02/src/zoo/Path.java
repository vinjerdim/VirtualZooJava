/**
 * Path mengelola road dan tur pada Zoo
 */

package zoo;

import cell.Cell;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Marvin Jerremy Budiman (13515076).
 *
 */
public class Path {
  private ArrayList<Cell> roadArray;
  private ArrayList<Cell> entranceArray;
  private Cell currentRoad;

  /**
   * Konstruktor kelas Path
   * I.S. sembarang
   * F.S. roadArray, entranceArray, currentRoad dialokasi
   */
  public Path() {
    roadArray = new ArrayList<Cell>();
    entranceArray = new ArrayList<Cell>();
    currentRoad = new Cell(0,0);
  }

  /**
   * I.S. sembarang
   * F.S. sama dengan I.S.
   * @return currentRoad
   */
  public Cell getCurrentRoad() {
    return currentRoad;
  }

  /**
   * I.S. sembarang
   * F.S. currentRoad terisi dengan suatu Road
   * @param road Road yang akan diisikan
   */
  public void setCurrentRoad(Cell road) {
    currentRoad = road;
  }

  /**
   * I.S. sembarang
   * F.S. sama dengan I.S.
   * @return Jumlah Road pada roadArray
   */
  public int numberOfRoad() {
    return roadArray.size();
  }

  /**
   * I.S. sembarang
   * F.S. sama dengan I.S.
   * @return Jumlah Entrance pada entranceArray
   */
  public int numberOfEntrance() {
    return entranceArray.size();
  }

  /**
   * I.S. sembarang
   * F.S. suatu Road ditambahkan pada roadArray
   * @param road Road yang akan ditambahkan
   */
  public void addRoad(Cell road) {
    roadArray.add(road);
  }

  /**
   * I.S. sembarang
   * F.S. suatu Entrance ditambahkan pada entranceArray
   * @param entrance Entrance yang akan ditambahkan
   */
  public void addEntrance(Cell entrance) {
    entranceArray.add(entrance);
  }

  /**
   * I.S. index di dalam range ukuran roadArray
   * F.S. sama dengan I.S.
   * @param index Indeks Road yang ingin diakses
   * @return Road pada indeks tertentu
   */
  public Cell getRoadByIndex(int index) {
    return roadArray.get(index);
  }

  /**
   * I.S. index di dalam range ukuran entranceArray
   * F.S. sama dengan I.S.
   * @param index Indeks Entrance yang ingin diakses
   * @return Entrance pada indeks tertentu
   */
  public Cell getEntranceByIndex(int index) {
    return entranceArray.get(index);
  }

  /**
   * Mengembalikan indeks pada roadArray yang elemennya mempunyai absis dan ordinat tertentu
   * I.S. sembarang
   * F.S. sama dengan I.S.
   * @param absis Absis dari Road yang dicari
   * @param ordinat Ordinat dari Road yang dicari
   * @return Indeks Road yang dicari pada roadArray, -1 jika tidak ditemukan
   */
  public int getRoadIndex(int absis, int ordinat) {
    int i = 0;
    boolean found = false;
    while (i < numberOfRoad() && !found) {
      if (getRoadByIndex(i).getCellAbsis() == absis
          && getRoadByIndex(i).getCellOrdinat() == ordinat) {
        found = true;
      } else {
        i++;
      }
    }
    return (found) ? i : -1;
  }

  /**
   * I.S. currentRoad terisi dengan suatu Road
   * F.S. sama dengan I.S.
   * @return Road yang menjadi langkah selanjutnya dalam tur
   */
  public Cell getNextRoad() {
    int absis = currentRoad.getCellAbsis();
    int ordinat = currentRoad.getCellOrdinat();
    ArrayList<Cell> candidate = new ArrayList<Cell>();
    int[] index = {getRoadIndex(absis + 1,ordinat),
        getRoadIndex(absis,ordinat + 1),
        getRoadIndex(absis - 1,ordinat),
        getRoadIndex(absis,ordinat - 1)};
    for (int i = 0;i < 4;i++) {
      if (index[i] != -1 && !getRoadByIndex(index[i]).isRoadVisited()) {
        candidate.add(getRoadByIndex(index[i]));
      }
    }
    if (candidate.size() == 0) {
      return currentRoad;
    } else {
      Random rand = new Random();
      int randomNumber = rand.nextInt(candidate.size());
      return candidate.get(randomNumber);
    }
  }

  /**
   * I.S. sembarang
   * F.S. semua Road pada roadArray di-set unvisited
   */
  public void setAllUnvisited() {
    for (int i = 0;i < roadArray.size();i++) {
      roadArray.get(i).setRoadVisited(false);
    }
  }
}