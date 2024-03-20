package domain;

public class Car {
    private static final int INITIAL_POSITION = 1;
    private String name;
    private int position;

    public Car(String name) {
        this.name = name;
        position = INITIAL_POSITION;
    }

    public void move(MoveNumber number) {
        if (number.isMovable()) {
            position++;
        }
    }

    boolean isWinner(int winnerPosition) {
        return winnerPosition == position;
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }
}
