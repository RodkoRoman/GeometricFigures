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

//    1.  Реализовать интерфейс «Фигура». Интерфейс содержит сигнатуры трех методов.
//    Первый метод возвращает периметр фигуры типом int.
//    Второй метод возвращает площадь фигуры типом int.
//    Третий метод возвращает имя фигуры типом String.
//    2.  Создать три (квадрат, прямоугольник, правильный шестиугольник) класса,которыере ализуют интерфейс фигура.
//    3.  В классах должен быть конструктор, который на вход принимает все необходимые параметры (стороны, имя и т.д.)
//    4.  Создать Main класс,в котором в методе public static void main(String[] args) {}
//    создать все три класса и вывести на печать результаты выполнения методов.
}