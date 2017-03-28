/**
 *
 */

package zoo;

import cell.Entrance;

import cell.Road;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Marvin Jerremy Budiman (13515076).
 *
 */
public class Path {
  private ArrayList<Road> roadArray;
  private ArrayList<Entrance> entranceArray;
  private Road currentRoad;

  public Path() {
    roadArray = new ArrayList<Road>();
    entranceArray = new ArrayList<Entrance>();
    currentRoad = new Road(0,0);
  }

  public Road getCurrentRoad() {
    return currentRoad;
  }

  public void setCurrentRoad(Road road) {
    currentRoad = road;
  }

  public int numberOfRoad() {
    return roadArray.size();
  }

  public int numberOfEntrance() {
    return entranceArray.size();
  }

  public void addRoad(Road road) {
    roadArray.add(road);
  }

  public void addEntrance(Entrance entrance) {
    entranceArray.add(entrance);
  }

  public Road getRoadByIndex(int index) {
    return roadArray.get(index);
  }

  public Road getEntranceByIndex(int index) {
    return entranceArray.get(index);
  }

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

  public Road getNextRoad() {
    int absis = currentRoad.getCellAbsis();
    int ordinat = currentRoad.getCellOrdinat();
    ArrayList<Road> candidate = new ArrayList<Road>();
    int[] index = {getRoadIndex(absis + 1,ordinat),
        getRoadIndex(absis,ordinat + 1),
        getRoadIndex(absis - 1,ordinat),
        getRoadIndex(absis,ordinat - 1)};
    for (int i = 0;i < 4;i++) {
      if (index[i] != -1 && !getRoadByIndex(index[i]).isVisited()) {
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
}
