package com.epicness.test.models;

/**
 * @author Luis Frontanilla
 */
public class GridModel extends Model {

    private Cell[][] cells;

    @Override
    void initialize() {
        // TODO these dimensions are default, the user can change them later
        cells = new Cell[2][2];
    }

    private class Cell {
        private int column, row;

        private Cell(int column, int row) {
            this.column = column;
            this.row = row;
        }

        public int getColumn() {
            return column;
        }

        public int getRow() {
            return row;
        }
    }
}
