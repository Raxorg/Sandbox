package com.epicness.sandbox.oldgdxinternal;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;

public class CommonAssets {

    private static boolean loaded = false;
    public static Texture buttonTexture, defaultCell, frame2;
    public static BitmapFont font;
    private static Preferences prefs;

    public static void load() {
        if (!loaded) {
            buttonTexture = new Texture(Gdx.files.internal("defaultCell.png"));
            buttonTexture.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);

            defaultCell = new Texture(Gdx.files.internal("defaultCell2.png"));
            defaultCell.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);
            //defaultCell.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);

            frame2 = new Texture(Gdx.files.internal("frame2.png"));

            font = new BitmapFont(Gdx.files.internal("charactersize.fnt"));
            font.getData().setScale(.3f, .3f);

            loaded = true;
        }
        prefs = Gdx.app.getPreferences("MyMainGame");
        if (!prefs.contains("highScore")) {
            prefs.putInteger("highScore", 0);
        }
    }

    public static int getHighScore() {
        return prefs.getInteger("highScore");
    }

}
