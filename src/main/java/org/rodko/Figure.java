package org.rodko;

public interface Figure {
    int getFigurePerimeter();
    int getFigureArea();
    String getFigureName();

    public default void getFigureInformation(){
        System.out.println("Название фигуры: " + getFigureName() +
                "\nПериметр фигуры: " + getFigurePerimeter() +
                "\nПлощадь  фигуры: " +getFigureArea() + "\n");
    }
}
