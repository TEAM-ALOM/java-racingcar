package domain;

import java.util.Objects;

public class Car {

    private static final int MINIMUM_MOVE_POWER =4;
    private final carName name;
    private final carPosition position;

    public Car(final String name) {
        this.name = new carName(name);
        this.position = new carPosition();
    }

    public void move(int power) {
        if (isEnough(power)) {
            position.increase();
        }
    }

    private boolean isEnough(final int power) {
        return power >= MINIMUM_MOVE_POWER;
    }

    public String getName() {
        return name.getValue();
    }

    public int getPosition() {
        return position.getValue();
    }

    @Override
    public String toString() {
        return name.getValue();
    }

    public boolean equals(final Object o) {
        if(this == o) {
            return true;
        }
        if(o == null || getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return Objects.equals(getName(), car.getName());
    }
}
