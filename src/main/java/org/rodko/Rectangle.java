package org.rodko;

public class Rectangle implements Figure {

    int sideLength;
    int sideWidth;
    String figureName;

    public Rectangle(int sideLength, int sideWidth, String figureName) {
        this.sideLength = sideLength;
        this.sideWidth = sideWidth;
        this.figureName = figureName;
    }

    @Override
    public int getFigurePerimeter() {
        return 2 * (sideLength + sideWidth);
    }

    @Override
    public int getFigureArea() {
        return sideLength * sideWidth;
    }

    @Override
    public String getFigureName() {
        return figureName;
    }
}
