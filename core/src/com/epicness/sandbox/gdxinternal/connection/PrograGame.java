package com.epicness.sandbox.gdxinternal.connection;

import com.epicness.sandbox.gdxinternal.core.GdxCore;

/**
 * @author Luis Frontanilla
 */
public class PrograGame implements Tools {

    public PrograGame() {
    }

    public void configureInterface() {

    }

    public void onButtonPressed(String buttonName) {

    }

    public void onCellPressed(int column, int row) {

    }

    @Override
    public void configureGrid(int numColumns, int numRows) {
        GdxCore.getInstance().configureGrid(numColumns,numRows);
    }

    @Override
    public void addText(String text) {

    }

    @Override
    public void addButton(String name) {

    }
}
