package com.epicness.sandbox.oldgdxinternal;


import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class SimpleCell extends SimpleButton {

    public SimpleCell(float x, float y, float width, float height, Texture texture, String name) {
        super(x, y, width, height, texture, name);
    }

    public void setTexture(Texture texture) {
        this.texture = texture;
    }

    public void draw(SpriteBatch batch) {
        batch.draw(texture, x, y, width, height);
    }
}
