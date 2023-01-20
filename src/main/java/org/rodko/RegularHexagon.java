package org.rodko;

public class RegularHexagon implements Figure {
    int sideLength;
    String figureName;

    public RegularHexagon(int sideLength, String figureName) {
        this.sideLength = sideLength;
        this.figureName = figureName;
    }

    @Override
    public int getFigurePerimeter() {
        return sideLength * 6;
    }

    @Override
    public int getFigureArea() {
        return (int)(3 * Math.round(Math.sqrt(3)) * sideLength)/2;
    }

    @Override
    public String getFigureName() {
        return figureName;
    }
}
