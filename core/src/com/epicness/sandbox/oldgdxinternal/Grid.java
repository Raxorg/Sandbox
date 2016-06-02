package com.epicness.sandbox.oldgdxinternal;


import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Grid {

    private SimpleCell[][] cells;

    public Grid(int numberOfColumns, int numberOfRows) {
        cells = new SimpleCell[numberOfColumns][numberOfRows];
        for (int c = 0; c < numberOfColumns; c++) {
            cells[c] = new SimpleCell[numberOfRows];
            for (int r = 0; r < numberOfRows; r++) {
                cells[c][r] = new SimpleCell(
                        c * (200 / (float) numberOfColumns),
                        (400 / 2) + r * ((400 / 2) / (float) numberOfRows),
                        200 / (float) numberOfColumns,
                        (400 / 2) / (float) numberOfRows,
                        CommonAssets.defaultCell,
                        "cell" + c + r
                );
            }
        }
    }

    public void draw(SpriteBatch batch) {
        for (SimpleCell[] cellColumn : cells) {
            for (SimpleCell cell : cellColumn) {
                cell.draw(batch);
            }
        }
    }

    public SimpleCell getCell(int x, int y) {
        return cells[x][y];
    }

    public int getNumColumns() {
        return cells.length;
    }

    public int getNumRows() {
        return cells[0].length;
    }
}
