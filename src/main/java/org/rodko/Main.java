package org.rodko;

public class Main {
    public static void main(String[] args) {

        Square square = new Square(4, "Квадрат");
        square.getFigureInformation();

        Rectangle rectangle = new Rectangle(4,6,"Прямоугольник");
        rectangle.getFigureInformation();

        RegularHexagon regularHexagon = new RegularHexagon(9, "Правильный шестиугольник");
        regularHexagon.getFigureInformation();
    }
}