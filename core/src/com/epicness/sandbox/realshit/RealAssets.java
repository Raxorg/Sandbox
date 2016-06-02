package com.epicness.sandbox.realshit;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * @author Luis Frontanilla
 */
public class RealAssets {

    private static RealAssets instance;

    private RealAssets() {

    }

    public static RealAssets getInstance() {
        if (instance == null) {
            instance = new RealAssets();
        }
        return instance;
    }

    private boolean loaded = false;

    public static Texture red;

    public void load() {
        if (!loaded) {
            //Texture tex = new Texture(new Texture(Gdx.files.internal("")));
            loaded = true;
        }
    }
}
