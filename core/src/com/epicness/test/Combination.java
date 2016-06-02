package com.epicness.test;

import com.epicness.test.controllers.Controller;
import com.epicness.test.models.Model;
import com.epicness.test.views.View;

/**
 * @author Luis Frontanilla
 */
public class Combination {

    private Model model;
    private View view;
    private Controller controller;

    public Combination(Model model, View view, Controller controller) {
        model.setCombination(this);
        view.setCombination(this);
        controller.setCombination(this);
        this.model = model;
        this.view = view;
        this.controller = controller;
    }

    public Model getModel() {
        return model;
    }

    public View getView() {
        return view;
    }

    public Controller getController() {
        return controller;
    }
}
