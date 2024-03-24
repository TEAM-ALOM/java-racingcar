package domain;

import java.util.Objects;

public class carPosition {

    private static final int INITIAL_VALUE = 0;
    private int value = INITIAL_VALUE;

    public void increase() {
        value++;
    }

    public int getValue() {
        return value;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if(o == null || getClass() != o.getClass()) {
            return false;
        }
        carPosition position = (carPosition) o;
        return getValue() == position.getValue();
    }
}