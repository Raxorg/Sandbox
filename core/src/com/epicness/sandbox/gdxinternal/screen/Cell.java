package com.epicness.sandbox.gdxinternal.screen;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.epicness.sandbox.gdxinternal.helpers.Assets;

/**
 * @author Luis Frontanilla
 */

public class Cell {

    private int column, row;

    public Cell(int column, int row) {
        this.column = column;
        this.row = row;
    }

    public void draw(SpriteBatch batch) {
        batch.draw(
                Assets.gray,
                column * 20,
                row * 20,
                20,
                20
        );
    }

}
