package com.epicness.test.models;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;

/**
 * @author Luis Frontanilla
 */
public class AssetModel extends Model {

    public static Texture gray, skyBlue;

    public void initialize() {
        Pixmap map = new Pixmap(1, 1, Pixmap.Format.RGBA8888);
        map.setColor(Color.GRAY);
        map.fill();
        gray = new Texture(map);
        map.setColor(new Color(170f / 255f, 160f / 255f, 242f / 255f, 1f));
        map.fill();
        skyBlue = new Texture(map);
        map.dispose();
    }
}
