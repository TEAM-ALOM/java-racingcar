package domain;

import java.util.Random;

public class cars {
    public static int standard = 4;
    public static void move(Car Car) {
        Random random = new Random();
        if (random.nextInt(10) >= standard) {
            Car.movementCar();
        }
    }


}
