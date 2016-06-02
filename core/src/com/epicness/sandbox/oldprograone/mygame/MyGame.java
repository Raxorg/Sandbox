package com.epicness.sandbox.oldprograone.mygame;

import com.epicness.sandbox.oldprograone.adapters.GraphicalTools;
import com.epicness.sandbox.oldprograone.adapters.IOSystem;

public class MyGame implements IOSystem {

    private GraphicalTools tools;

    public MyGame(GraphicalTools tools) {
        this.tools = tools;
    }

    @Override
    public void initializeInterface() {

    }

    @Override
    public void onButtonPressed(String name) {

    }

    @Override
    public void onCellPressed(int vertical, int horizontal) {

    }
}
