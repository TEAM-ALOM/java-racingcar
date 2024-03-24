package domain;

public class Car {
    private final int start = 0;
    private final int movement = 1;
    private int position;
    private final String name;

    public Car(String name){
        this.name = name;
        this.position = start;
    }

    public void movementCar(){
        this.position += movement;
    }





}
