package com.epicness.test.controllers;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputMultiplexer;

/**
 * @author Luis Frontanilla
 */
public class ControllerManager {

    private static ControllerManager instance;

    private InputMultiplexer multiplexer;
    private Controller[] controllers;

    private ControllerManager() {
        multiplexer = new InputMultiplexer();
    }

    public static ControllerManager getInstance() {
        if (instance == null) {
            instance = new ControllerManager();
        }
        return instance;
    }

    public void initialize(Controller... controllers) {
        this.controllers = controllers;
        for (Controller controller : this.controllers) {
            multiplexer.addProcessor(controller);
        }
        Gdx.input.setInputProcessor(multiplexer);
    }
}
