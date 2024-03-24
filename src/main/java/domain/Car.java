package domain;

public class Car {
    private static final int MOVE_POINT = 4;
    private String carName;
    private int position;
    public Car(String carName) {
        this.carName = carName;
        position = 0;
    }

    public void move(int value){
        if(value >= MOVE_POINT){
            position++;
        }
    }

    public int getPosition() {
        return position;
    }
    public void setPosition(int position) {
        this.position = position;
    }
    public String getCarName() {
        return carName;
    }
}
