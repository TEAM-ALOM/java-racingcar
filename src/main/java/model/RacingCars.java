package model;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class RacingCars {
    public static ArrayList<Car> cars = new ArrayList<>();
    public RacingCars(ArrayList<String> carNames){
        for(String s : carNames) {
            cars.add(new Car(s));
        }
    }
    public ArrayList<Car> getList(){
        return cars;
    }

}
