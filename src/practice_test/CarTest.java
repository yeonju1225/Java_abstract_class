package practice_test;

import java.util.ArrayList;

public class CarTest {
    public static void main(String[] args) {
        ArrayList<Car> carlist = new ArrayList<Car>();
        carlist.add(new Sonata());
        carlist.add(new Grandeur());
        carlist.add(new Genesis());
        carlist.add(new Avante());

        for (Car car : carlist) {
            car.run();
            System.out.println("=============================");
        }
    }
}
