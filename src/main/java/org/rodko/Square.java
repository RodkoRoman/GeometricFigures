package org.rodko;

public class Square implements Figure {

    int sideLength;
    String figureName;

    public Square(int sideLength, String figureName) {
        this.sideLength = sideLength;
        this.figureName = figureName;
    }

    @Override
    public int getFigurePerimeter() {
        return sideLength * 4;
    }

    @Override
    public int getFigureArea() {
        return sideLength * sideLength;
    }

    @Override
    public String getFigureName() {
        return figureName;
    }
}
