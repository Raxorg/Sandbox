package com.epicness.sandbox.prograone.adapters;

import com.badlogic.gdx.graphics.Color;

public interface GraphicalTools {

    void setTitle(String title);

    Color getBackgroundColor();

    void setBackgroundColor(Color c);

    void addButton(String name);

    void removeButton(String name);

    void addText(String text);

    void setImageOnCell(int column, int row, String image);

    void configureGrid(int numberOfRows, int numberOfColumns);
}
