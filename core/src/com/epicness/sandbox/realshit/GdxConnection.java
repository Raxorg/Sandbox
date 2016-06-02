package com.epicness.sandbox.realshit;

import com.badlogic.gdx.Game;
import com.epicness.sandbox.gdxinternal.core.GdxCore;
import com.epicness.sandbox.gdxinternal.helpers.Assets;

/**
 * @author Luis Frontanilla
 */
public class GdxConnection extends Game {

    @Override
    public void create() {
        Assets.load();
        setScreen(GdxCore.getInstance().getScreen());
    }
}
