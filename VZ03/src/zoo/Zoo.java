/**
 *
 */

package zoo;

import cell.Cell;

/**
 * @author Marvin Jerremy Budiman (13515076).
 *
 */
public class Zoo {
  private Cell[][] zooCells;
  private int column;
  private int row;

  /**
   * Konstrutor kelas Zoo.
   * I.S. sembarang
   * F.S. zooCells dialokasi dengan ukuran tertentu
   * @param column Jumlah kolom Zoo
   * @param row Jumlah baris Zoo
   */
  public Zoo(int column, int row) {
    zooCells = new Cell[column][row];
  }

  /**
   * I.S. sembarang
   * F.S. sama dengan I.S.
   * @return Jumlah kolom dari Zoo
   */
  public int getZooColumn() {
    return column;
  }

  /**
   * I.S. sembarang
   * F.S. sama dengan I.S.
   * @return Jumlah baris dari Zoo
   */
  public int getZooRow() {
    return row;
  }

  /**
   * I.S. column dan row tidak melebihi ukuran zooCells
   * F.S. zooCells terisi dengan suatu Cell
   * @param column Kolom letak pengisian
   * @param row Baris letak pengisian
   * @param cell Cell yang hendak diisi ke zooCells
   */
  public void setZooCell(int column, int row, Cell cell) {
    zooCells[column][row] = cell;
  }

  /**
   * I.S. column dan row tidak melebihi ukuran zooCells
   * F.S. sama dengan I.S.
   * @param column Kolom yang ingin diakses
   * @param row Baris yang ingin diakses
   * @return Cell pada kolom dan baris yang diinginkan
   */
  public Cell getZooCell(int column, int row) {
    return zooCells[column][row];
  }
}
