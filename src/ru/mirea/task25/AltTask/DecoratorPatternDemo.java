package ru.mirea.task25.AltTask;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        RedShapeDecorator redCircle = new RedShapeDecorator(circle);

        circle.draw();
        System.out.println();
        redCircle.draw();

        Shape rectangle = new Rectangle();
        RedShapeDecorator redRectangle = new RedShapeDecorator(rectangle);

        rectangle.draw();
        System.out.println();
        redRectangle.draw();
    }
}
