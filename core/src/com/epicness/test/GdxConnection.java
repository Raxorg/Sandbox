package com.epicness.test;

import com.badlogic.gdx.Game;
import com.epicness.test.controllers.ControllerManager;
import com.epicness.test.controllers.GridController;
import com.epicness.test.models.AssetModel;
import com.epicness.test.models.ModelManager;
import com.epicness.test.views.GridView;
import com.epicness.test.views.ViewManager;

/**
 * @author Luis Frontanilla
 */
public class GdxConnection extends Game {

    @Override
    public void create() {
        initializeModels();
        initializeViews();
        initializeControllers();
        combineComponents();
    }

    // The models directly manage the data, logic and rules of the application.
    private void initializeModels() {
        AssetModel assetModel = new AssetModel();
        ModelManager.getInstance().initialize(assetModel);
    }

    // A view can be any output representation of information, such as a chart or a diagram.
    // Multiple views of the same information are possible, such as a bar chart for management
    // and a tabular view for accountants.
    private void initializeViews() {
        GridView gridView = new GridView();
        ViewManager.getInstance().initialize(gridView);

        setScreen(ViewManager.getInstance().getAppScreen());
    }

    // The third part, the controller, accepts input and converts it to commands for the model or view.
    private void initializeControllers() {
        GridController gridController = new GridController();
        ControllerManager.getInstance().initialize(gridController);
    }

    private void combineComponents() {

    }
}
