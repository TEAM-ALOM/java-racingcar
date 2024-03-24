package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.StringJoiner;

import static racingcar.constant.ErrorMessage.CAR_NAME_CONTAINS_SPACE_ERROR;
import static racingcar.constant.ErrorMessage.CAR_NAME_LENGTH_ERROR;

public class Car implements Comparable<Car> {
    private static final int MOVE_LOWER_BOUND = 4;
    private static final int MOVE_SIZE = 1;
    private static final int DEFAULT_POSITION = 0;
    private static final int MAX_NAME_SIZE = 5;
    private static final String NAME_SIZE_DELIMITER = ":";
    private static final String SPACE = " ";
    private static final int RANDOM_MIN = 0;
    private static final int RANDOM_MAX = 9;

    private final String name;
    private final Position position;

    public Car(String name, Integer position) {
        validate(name);
        this.name = name;
        this.position = new Position(position);
    }

    public static Car of(String name) {
        return new Car(name, DEFAULT_POSITION);
    }

    private void validate(String name) {
        if (name == null || "".equals(name)) {
            throw new IllegalArgumentException(CAR_NAME_LENGTH_ERROR.getErrorMessage());
        }

        if (name.length() > MAX_NAME_SIZE) {
            throw new IllegalArgumentException(CAR_NAME_LENGTH_ERROR.getErrorMessage());
        }

        if (name.contains(SPACE)) {
            throw new IllegalArgumentException(CAR_NAME_CONTAINS_SPACE_ERROR.getErrorMessage());
        }
    }

    public void move() {
        int randomNumber = Randoms.pickNumberInRange(RANDOM_MIN, RANDOM_MAX);

        if (randomNumber > MOVE_LOWER_BOUND) {
            position.move(MOVE_SIZE);
        }
    }

    public boolean equalsPosition(Object o) {
        if (this == o)
            return true;

        if (o == null || this.getClass() != o.getClass())
            return false;

        Car targetCar = (Car)o;

        return this.position.equals(targetCar.position);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringJoiner stringJoiner = new StringJoiner(" ");

        stringJoiner.add(name);
        stringJoiner.add(NAME_SIZE_DELIMITER);
        stringJoiner.add(position.toString());

        return stringJoiner.toString();
    }

    @Override
    public int compareTo(Car target) {
        return this.position.compareTo(target.position);
    }
}
