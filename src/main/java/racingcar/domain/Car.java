package racingcar.domain;

public class Car {
    private final int STARTING_POINT = 0;
    private final int MOVEMENT_DEGREE = 1;
    private final String name;
    private int progressionDegree;

    public Car(String name) {
        this.name = name;
        this.progressionDegree = STARTING_POINT;
    }

    public void moveCar() {
        this.progressionDegree += MOVEMENT_DEGREE;
    }

    public String getName(){
        return this.name;
    }

    public int getProgressionDegree(){
        return this.progressionDegree;
    }
}
