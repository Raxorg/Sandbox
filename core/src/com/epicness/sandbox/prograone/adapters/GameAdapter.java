package com.epicness.sandbox.prograone.adapters;


import com.epicness.sandbox.prograone.playground.Main;

/**
 * This class allows to select what UI will be used by the Android library.
 *
 * @author Alexis Marechal
 * @author Alfredo Villalba
 */
public class GameAdapter {
    public static IOSystem selectGame(GraphicalTools mmi) {
        return new Main(mmi);
    }
}