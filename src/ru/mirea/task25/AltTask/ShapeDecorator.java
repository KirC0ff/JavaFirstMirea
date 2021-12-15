package ru.mirea.task25.AltTask;

public abstract class ShapeDecorator implements Shape {
    public final Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    public void draw() {
        shape.draw();
    }

}
