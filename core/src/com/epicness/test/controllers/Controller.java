package com.epicness.test.controllers;

import com.badlogic.gdx.InputAdapter;
import com.epicness.test.Combination;

/**
 * @author Luis Frontanilla
 */
public abstract class Controller extends InputAdapter {

    protected Combination combination;

    public void setCombination(Combination combination) {
        this.combination = combination;
    }

}
