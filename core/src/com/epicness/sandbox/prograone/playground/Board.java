package com.epicness.sandbox.prograone.playground;

public class Board {

    private Cell[][] cells;

    public Board(int numColumns, int numRows) {
        cells = new Cell[numColumns][numRows];
        for (int column = 0; column < numColumns; column++) {
            for (int row = 0; row < numRows; row++) {
                cells[column][row] = new Cell();
            }
        }
    }

    public Cell getCell(int column, int row) {
        return cells[column][row];
    }
}
