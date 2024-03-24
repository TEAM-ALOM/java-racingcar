package domain;

public class Distance {

    private static final int INITIAL_VALUE = 0;
    private int distance;

    public Distance() {
        this.distance = INITIAL_VALUE;
    }

    public void increaseDistance() {
        distance++;
    }

    public int getDistance() {
        return distance;
    }
}
