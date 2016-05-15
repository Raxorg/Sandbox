package com.epicness.sandbox.prograone.playground;

import com.badlogic.gdx.graphics.Color;
import com.epicness.sandbox.prograone.adapters.GraphicalTools;
import com.epicness.sandbox.prograone.adapters.IOSystem;

public class Main implements IOSystem {

    private GraphicalTools tools;
    private Board board;
    private boolean gameStarted = false;
    private boolean playerOneTurn;
    
    // HOLA

    // ADIOS

    public Main(GraphicalTools tools) {
        this.tools = tools;
        board = new Board(3, 3);
        playerOneTurn = true;
    }

    @Override
    public void initializeInterface() {
        tools.configureGrid(3, 3);
        tools.addButton("abcd");
        tools.setTitle("Tic Tac Tow Sin diagonales D:");
        tools.setBackgroundColor(Color.RED);
    }

    @Override
    public void onButtonPressed(String buttonName) {
        if (buttonName.equals("abcd")) {
            for (int x = 0; x < 3; x++) {
                for (int y = 0; y < 3; y++) {
                    board.getCell(x, y).setPiece(' ');
                    tools.setImageOnCell(x, y, "defaultCell2.png");
                }
            }
            tools.removeButton("abcd");
            gameStarted = true;
        }
    }

    @Override
    public void onCellPressed(int column, int row) {
        if (gameStarted) {
            char piece;
            if (playerOneTurn) {
                piece = 'x';
            } else {
                piece = 'o';
            }
            playerMove(column, row, piece);
            verifyWinCondition(column, row, piece);
        }
    }

    private void playerMove(int column, int row, char piece) {
        if (board.getCell(column, row).isEmpty()) {
            tools.setImageOnCell(column, row, piece + ".png");
            board.getCell(column, row).setPiece(piece);
        }
    }

    private void verifyWinCondition(int column, int row, char piece) {
        boolean playerWon = false;
        // PARA FILA
        int counter = 0;
        for (int c = 0; c < 3; c++) {
            Cell currentCell = board.getCell(c, row);
            if (!currentCell.isEmpty() && currentCell.getPiece() == piece) {
                counter++;
                if (counter == 3) {
                    playerWon = true;
                }
            }
        }
        // PARA COLUMNA
        counter = 0;
        for (int r = 0; r < 3; r++) {
            Cell currentCell = board.getCell(column, r);
            if (!currentCell.isEmpty() && currentCell.getPiece() == piece) {
                counter++;
                if (counter == 3) {
                    playerWon = true;
                }
            }
        }
        if (playerWon) {
            tools.addButton("abcd"); // restart button
            gameStarted = false;
        } else {
            if (boardIsFull()) {
                tools.addButton("abcd"); // restart button
                gameStarted = false;
                playerOneTurn = true;
            } else {
                passTurn();
            }
        }
    }

    private void passTurn() {
        playerOneTurn = !playerOneTurn;
    }

    private boolean boardIsFull() {
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                if (board.getCell(x, y).isEmpty()) {
                    return false;
                }
            }
        }
        return true;
    }

}
