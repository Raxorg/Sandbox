package com.epicness.test.models;

/**
 * @author Luis Frontanilla
 */
public class ModelManager {

    private static ModelManager instance;

    private Model[] models;

    public static ModelManager getInstance() {
        if (instance == null) {
            instance = new ModelManager();
        }
        return instance;
    }

    private ModelManager() {

    }

    public void initialize(Model... models) {
        this.models = models;
        for (Model model: this.models) {
            model.initialize();
        }
    }
}
