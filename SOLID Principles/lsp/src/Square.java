package com.solid.lsp;

public class Square extends Shape{

    private int side;

    public Square(int side) {
        this.side = side;
    }


    @Override
    public int getArea() {
        return this.side * this.side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
