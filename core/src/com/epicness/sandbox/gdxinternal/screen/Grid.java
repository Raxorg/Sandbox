package com.epicness.sandbox.gdxinternal.screen;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * @author Luis Frontanilla
 */
public class Grid {

    private static Grid instance;
    private Cell[][] cells;
    private int numColumns, numRows;

    private Grid() {
        cells = new Cell[2][2];
        for (int c = 0; c < 2; c++) {
            for (int r = 0; r < 2; r++) {
                cells[c][r] = new Cell(c, r);
            }
        }
    }

    public static Grid getInstance() {
        if (instance == null) {
            instance = new Grid();
        }
        return instance;
    }

    public Grid(int numColumns, int numRows) {
        cells = new Cell[numColumns][numRows];
    }

    public void draw(SpriteBatch batch) {
        for (int c = 0; c < numColumns; c++) {
            for (int r = 0; r < numRows; r++) {
                cells[c][r].draw(batch);
            }
        }
    }

    public void config(int numColumns, int numRows) {
        cells = new Cell[numColumns][numRows];
        for (int c = 0; c < numColumns; c++) {
            for (int r = 0; r < numRows; r++) {
                cells[c][r] = new Cell(c, r);
            }
        }
    }
}
