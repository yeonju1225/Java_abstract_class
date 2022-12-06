package practice_test;

public abstract class Car {
    String carName;

    public abstract void start();
    public abstract void drive();
    public abstract void stop();
    public abstract void turnOff();

    public void washCar() {
        System.out.println("세차를 합니다.");
    }

    final public void run() {
        start();
        drive();
        stop();
        turnOff();
        washCar();
    }
}
