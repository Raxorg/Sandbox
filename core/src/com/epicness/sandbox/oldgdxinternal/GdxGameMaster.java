package com.epicness.sandbox.oldgdxinternal;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.epicness.sandbox.oldprograone.adapters.GameAdapter;
import com.epicness.sandbox.oldprograone.adapters.GraphicalTools;
import com.epicness.sandbox.oldprograone.adapters.IOSystem;


/**
 * The UPB android library. Please note that this class is NOT meant to teach android nor
 * good android practices nor libGDX nor good libGDX practices.
 *
 * @author Kevin Viscafe
 * @author Luis Frontanilla
 */

public class GdxGameMaster extends InputAdapter implements GraphicalTools {

    private IOSystem mi;

    private GameScreen screen;
    private Grid grid;
    private ButtonBox buttonBox;
    private TextBox textBox;

    public final float GAME_WIDTH = 200, GAME_HEIGHT = 400;

    private float scaleFactorX;
    private float scaleFactorY;

    public GdxGameMaster() {
        // Factores de escalamiento
        scaleFactorX = Gdx.graphics.getWidth() / GAME_WIDTH;
        scaleFactorY = Gdx.graphics.getHeight() / GAME_HEIGHT;

        // Primero los adaptadores
        mi = GameAdapter.selectGame(this);

        // Luego algunas cosas necesarias
        screen = new GameScreen(this);
        Gdx.input.setInputProcessor(this);

        // Creamos el button box y el text box
        buttonBox = new ButtonBox();
        textBox = new TextBox();
        grid = new Grid(3, 3);

        // Al final llamamos al inicializador
        mi.initializeInterface();
    }

    @Override
    public void setTitle(String title) {
        Gdx.graphics.setTitle(title);
    }

    @Override
    public Color getBackgroundColor() {
        return screen.getBackgroundColor();
    }

    @Override
    public void setBackgroundColor(Color color) {
        screen.setBackgroundColor(color);
    }

    @Override
    public void addButton(String buttonName) {
        buttonBox.addButton(buttonName);
    }

    @Override
    public void removeButton(String buttonName) {
        buttonBox.removeButton(buttonName);
    }

    @Override
    public void addText(String text) {
        textBox.addText(text);
    }

    @Override
    public void setImageOnCell(int column, int row, String image) {
        grid.getCell(column, row).setTexture(new Texture(Gdx.files.internal(image)));
    }

    @Override
    public void configureGrid(int numberOfColumns, int numberOfRows) {
        grid = new Grid(numberOfColumns, numberOfRows);
    }

    public Screen getScreen() {
        return screen;
    }

    public Grid getGrid() {
        return grid;
    }

    public ButtonBox getButtonBox() {
        return buttonBox;
    }

    public TextBox getTextBox() {
        return textBox;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        screenX = scaleX(screenX);
        screenY = scaleY(screenY);
        screenY = (int) GAME_HEIGHT - screenY;
        // PARA BOTONES
        for (SimpleButton sb : buttonBox.getButtons()) {
            if (sb.isTouchDown(screenX, screenY)) {
                return true;
            }
        }
        // PARA CELDAS
        for (int x = 0; x < grid.getNumColumns(); x++) {
            for (int y = 0; y < grid.getNumRows(); y++) {
                if (grid.getCell(x, y).isTouchDown(screenX, screenY)) {
                    return true;
                }
            }
        }
        return true;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        screenX = scaleX(screenX);
        screenY = scaleY(screenY);
        screenY = (int) GAME_HEIGHT - screenY;
        // PARA BOTONES
        for (SimpleButton sb : buttonBox.getButtons()) {
            if (sb.isTouchUp(screenX, screenY)) {
                mi.onButtonPressed(sb.getName());
                break;
            }
        }
        // PARA CELDAS
        for (int x = 0; x < grid.getNumColumns(); x++) {
            for (int y = 0; y < grid.getNumRows(); y++) {
                if (grid.getCell(x, y).isTouchUp(screenX, screenY)) {
                    mi.onCellPressed(x, y);
                    return true;
                }
            }
        }
        return true;
    }

    private int scaleX(int screenX) {
        return (int) (screenX / scaleFactorX);
    }

    private int scaleY(int screenY) {
        return (int) (screenY / scaleFactorY);
    }
}
