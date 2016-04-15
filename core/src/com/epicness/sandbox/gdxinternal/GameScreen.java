package com.epicness.sandbox.gdxinternal;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameScreen extends ScreenAdapter {

    private GdxGameMaster master;
    private SpriteBatch batch;
    private Color backgroundColor = new Color(0, 0, 0.8f, 1);
    private OrthographicCamera cam;

    public GameScreen(GdxGameMaster master) {
        this.master = master;
        cam = new OrthographicCamera();
        cam.setToOrtho(false, 200, 400);
        batch = new SpriteBatch();
        batch.setProjectionMatrix(cam.combined);
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(backgroundColor.r, backgroundColor.g, backgroundColor.b, backgroundColor.a);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();
        master.getGrid().draw(batch);
        master.getButtonBox().draw(batch);
        master.getTextBox().draw(batch);
        batch.end();
    }
}
