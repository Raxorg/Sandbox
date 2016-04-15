package com.epicness.sandbox.gdxinternal;

import com.badlogic.gdx.graphics.g2d.NinePatch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.NinePatchDrawable;

import java.util.ArrayList;

public class ButtonBox {

    private ArrayList<SimpleButton> buttons;
    private TextButton.TextButtonStyle style;
    private TextButton button;

    public ButtonBox() {
        buttons = new ArrayList<SimpleButton>();
        NinePatch ninePatch = new NinePatch(CommonAssets.frame2, 12, 12, 12, 12);
        NinePatchDrawable ninePatchDrawable = new NinePatchDrawable(ninePatch);
        style = new TextButton.TextButtonStyle(ninePatchDrawable, ninePatchDrawable, ninePatchDrawable, CommonAssets.font);
        button = new TextButton("derp", style);
    }

    public void addButton(String buttonName) {
        buttons.add(new SimpleButton(
                0,
                (4 - buttons.size()) * ((400 / 2) / 5),
                200 / 2,
                ((400 / 2) / 5),
                CommonAssets.buttonTexture,
                buttonName
        ));
    }

    public void draw(SpriteBatch batch) {
        for (SimpleButton sb : buttons) {
            sb.draw(batch);
        }
        button.draw(batch, 1);
    }

    public ArrayList<SimpleButton> getButtons() {
        return buttons;
    }

    public void removeButton(String buttonName) {
        for (int i = 0; i < buttons.size(); i++) {
            if (buttons.get(i).getName().equals(buttonName)) {
                buttons.remove(i);
                break;
            }
        }
    }
}
