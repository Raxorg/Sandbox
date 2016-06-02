package com.epicness.test.views;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * @author Luis Frontanilla
 */
public class ViewManager {

    private static ViewManager instance;

    private Screen appScreen;
    private View[] views;

    private ViewManager() {
        appScreen = new AppScreen();
    }

    public static ViewManager getInstance() {
        if (instance == null) {
            instance = new ViewManager();
        }
        return instance;
    }

    public void initialize(View... views) {
        this.views = views;
    }

    public Screen getAppScreen() {
        return appScreen;
    }

    private class AppScreen extends ScreenAdapter {

        private SpriteBatch batch;

        private AppScreen() {
            batch = new SpriteBatch();
        }

        @Override
        public void render(float delta) {
            Gdx.gl.glClearColor(1, 1, 1, 1);
            Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
            batch.begin();
            for (View view : views) {
                view.render(delta, batch);
            }
            batch.end();
        }
    }
}
