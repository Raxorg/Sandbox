package com.epicness.sandbox.gdxinternal.core;

import com.badlogic.gdx.Screen;
import com.epicness.sandbox.gdxinternal.connection.PrograGame;
import com.epicness.sandbox.gdxinternal.screen.Grid;
import com.epicness.sandbox.prograone.ExampleGame;

/**
 * @author Luis Frontanilla
 */
public class GdxCore {

    private static GdxCore instance;

    private Screen screen;
    private PrograGame game;

    private GdxCore() {
        screen = new Renderer();
        game = new ExampleGame();
        game.configureInterface();
    }

    public static GdxCore getInstance() {
        if (instance == null) {
            instance = new GdxCore();
        }
        return instance;
    }

    public Screen getScreen() {
        return screen;
    }

    public void configureGrid(int numColumns, int numRows) {
        Grid.getInstance().config(numColumns, numRows);
    }
}
