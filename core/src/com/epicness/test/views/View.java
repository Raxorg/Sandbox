package com.epicness.test.views;

import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.epicness.test.Combination;

/**
 * @author Luis Frontanilla
 */
public abstract class View extends ScreenAdapter {

    protected Combination combination;

    public void setCombination(Combination combination) {
        this.combination = combination;
    }

    abstract void render(float delta, SpriteBatch batch);
}
