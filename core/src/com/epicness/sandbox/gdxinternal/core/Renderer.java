package com.epicness.sandbox.gdxinternal.core;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.epicness.sandbox.gdxinternal.screen.Grid;

/**
 * @author Luis Frontanilla
 */
public class Renderer extends ScreenAdapter {

    private SpriteBatch batch;

    public Renderer() {
        batch = new SpriteBatch();
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        Grid.getInstance().draw(batch);
        batch.end();
    }
}
