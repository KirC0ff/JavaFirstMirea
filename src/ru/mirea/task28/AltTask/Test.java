package ru.mirea.task28.AltTask;

public class Test {
    public static void main(String[] args) {
        Car car1 = new Car("Mitsubishi Lancer", new Car.Engine(291),
                new Car.Door[]{new Car.Door(false),
                new Car.Door(false),
                new Car.Door(false),
                new Car.Door(false)});
        car1.openDoor(1);
        car1.closeDoor(1);
        car1.start();
    }
}
