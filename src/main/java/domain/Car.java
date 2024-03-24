package domain;

public class Car {

    private static final int CAN_MOVE_NUMBER = 4;
    private final CarName carName;
    private final Distance distance;


    public Car(String carName) {
        this.carName = new CarName(carName);
        this.distance = new Distance();
    }

    public void move(int number) {
        if (number >= CAN_MOVE_NUMBER) {
            distance.increaseDistance();
        }
    }

    public String getCarName() {
        return carName.getCarName();
    }

    public int getDistance() {
        return distance.getDistance();
    }
}
