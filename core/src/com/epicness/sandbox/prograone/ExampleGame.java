package com.epicness.sandbox.prograone;

import com.epicness.sandbox.gdxinternal.connection.PrograGame;

public class ExampleGame extends PrograGame {

    @Override
    public void configureInterface() {
        configureGrid(5, 5);
    }

    @Override
    public void onButtonPressed(String buttonName) {

    }

    @Override
    public void onCellPressed(int column, int row) {

    }
}
