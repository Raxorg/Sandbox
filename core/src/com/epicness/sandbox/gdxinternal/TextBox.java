package com.epicness.sandbox.gdxinternal;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;

public class TextBox {

    private ArrayList<String> texts;
    protected final float CHAR_WIDTH = 50 * .3f;
    protected final float CHAR_HEIGHT = 70 * .3f;

    public TextBox() {
        texts = new ArrayList<String>();
    }

    public void addText(String text) {
        texts.add(text);
    }

    public void draw(SpriteBatch batch) {
        for (int i = 0; i < texts.size(); i++) {
            // DRAW THE TEXT
            batch.draw(
                    CommonAssets.defaultCell,
                    Gdx.graphics.getWidth() / 2,
                    (Gdx.graphics.getHeight() / 2) - (i + 1) * Gdx.graphics.getHeight() / 10,
                    Gdx.graphics.getWidth() / 2,
                    (Gdx.graphics.getHeight() / 2) / 5
            );
            // DRAW THE TEXT
            CommonAssets.font.draw(
                    batch,
                    texts.get(i),
                    (Gdx.graphics.getWidth() / 2) + (Gdx.graphics.getWidth() / 4) -
                            (texts.get(i).length() * (CHAR_WIDTH / 2)),
                    (Gdx.graphics.getHeight() / 2) - (i * ((Gdx.graphics.getHeight() / 2) / 5)) -
                            ((((Gdx.graphics.getHeight() / 2) / 5) - CHAR_HEIGHT) / 2)
            );
        }
    }

}
