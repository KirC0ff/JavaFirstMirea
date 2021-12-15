package ru.mirea.task28.AltTask;

public class Car {
    String model;

    public static class Door {

        private final boolean automatic;
        private boolean opened = false;

        public Door(boolean automatic) {
            this.automatic = automatic;
        }

        public boolean isAutomatic() {
            return automatic;
        }

        public boolean isOpened() {
            return opened;
        }

        public void setOpened(boolean opened) {
            this.opened = opened;
        }
    }

    public static class Engine {

        private final int power;
        private boolean started;

        public Engine(int power) {
            this.power = power;
        }

        public int getPower() {
            return power;
        }

        public boolean isStarted() {
            return started;
        }

        public void setStarted(boolean started) {
            this.started = started;
        }
    }

    private final Engine engine;
    private final Door[] doors;

    public Car(String model, Engine engine, Door[] doors) {
        this.model = model;
        this.engine = engine;
        this.doors = doors;
    }

    public void start() {
        engine.setStarted(true);
        System.out.println("Двигатель запущен");
    }

    public void stop() {
        engine.setStarted(false);
        System.out.println("Двигатель остановлен");
    }

    public void openDoor(int n) {
        doors[n].setOpened(true);
        System.out.println("Дверь " + n + " открыта");
    }

    public void closeDoor(int n) {
        doors[n].setOpened(false);
        System.out.println("Дверь " + n + " закрыта");
    }
}
