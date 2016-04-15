package com.epicness.sandbox.prograone.adapters;

import com.badlogic.gdx.Game;
import com.epicness.sandbox.gdxinternal.CommonAssets;
import com.epicness.sandbox.gdxinternal.GdxGameMaster;

public class AndroidAdapter extends Game {

    @Override
    public void create() {
        CommonAssets.load();
        setScreen(new GdxGameMaster().getScreen());
    }
}
