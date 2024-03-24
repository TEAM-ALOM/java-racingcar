package model;

import model.Car;
import view.Output;

import java.util.Scanner;

public class CarFactory {
    public Car[] create() {
        Output.carNameO();

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] names = str.split(",");
        Car[] cars = new Car[names.length];

        for (int i = 0; i < names.length; ++i) {
            cars[i] = new Car(names[i]);
        }

        return cars;
    }

}
