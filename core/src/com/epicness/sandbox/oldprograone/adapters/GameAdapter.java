package com.epicness.sandbox.oldprograone.adapters;


import com.epicness.sandbox.oldprograone.playground.Main;

/**
 * This class allows to select what UI will be used by the Android library.
 *
 * @author Alexis Marechal
 * @author Alfredo Villalba
 */
public class GameAdapter {
    public static IOSystem selectGame(GraphicalTools tools) {
        return new Main(tools);
    }
}