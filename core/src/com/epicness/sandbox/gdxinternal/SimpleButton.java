package com.epicness.sandbox.gdxinternal;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public class SimpleButton {

    protected float x, y, width, height;
    protected Texture texture;
    protected Rectangle bounds;
    protected boolean isPressed = false;
    protected String name;
    protected final float CHAR_WIDTH = 50 * .3f;
    protected final float CHAR_HEIGHT = 70 * .3f;

    public SimpleButton(float x, float y, float width, float height,
                        Texture texture, String name) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.texture = texture;
        this.name = name;

        bounds = new Rectangle(x, y, width, height);

    }

    public boolean isPressed(int screenX, int screenY) {
        return bounds.contains(screenX, screenY);
    }

    public void draw(SpriteBatch batch) {
        batch.draw(texture, x, y, width, height);
        CommonAssets.font.draw(
                batch,
                name,
                (x + width / 2) - (name.length() * (CHAR_WIDTH / 2)),
                (y + height) - ((height - CHAR_HEIGHT) / 2)
        );
    }

    public boolean isTouchDown(int screenX, int screenY) {
        if (bounds.contains(screenX, screenY)) {
            isPressed = true;
            return true;
        }
        return false;
    }

    public boolean isTouchUp(int screenX, int screenY) {
        // It only counts as a touchUp if the buttonTexture is in a pressed state.
        if (bounds.contains(screenX, screenY) && isPressed) {
            isPressed = false;
            return true;
        }

        // Whenever a finger is released, we will cancel any presses.
        isPressed = false;
        return false;
    }

    public String getName() {
        return name;
    }

}
