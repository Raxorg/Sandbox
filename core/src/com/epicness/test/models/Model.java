package com.epicness.test.models;

import com.epicness.test.Combination;

/**
 * @author Luis Frontanilla
 */
public abstract class Model {

    protected Combination combination;

    abstract void initialize();

    public void setCombination(Combination combination) {
        this.combination = combination;
    }
}
