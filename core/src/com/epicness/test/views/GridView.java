package com.epicness.test.views;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.epicness.test.models.AssetModel;

/**
 * @author Luis Frontanilla
 */
public class GridView extends View {

    public void render(float delta, SpriteBatch batch) {
        batch.draw(
                AssetModel.gray, 0, 0, 100, 100
        );
    }
}
