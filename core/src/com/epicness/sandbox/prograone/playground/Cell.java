package com.epicness.sandbox.prograone.playground;

public class Cell {

    private char piece;

    public Cell() {
        piece = ' ';
    }

    public void setPiece(char piece) {
        this.piece = piece;
    }

    public boolean isEmpty() {
        return piece == ' ';
    }

    public char getPiece() {
        return piece;
    }

}
