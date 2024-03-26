package domain;

public class Count {

    private static final int PLAYABLE_MIN_COUNT = 1;

    private int value;

    Count(final int value) {
        this.value = value;
    }

    public void decrease() {
        value--;
    }

    public boolean isPlayable() {
        return PLAYABLE_MIN_COUNT <= value;
    }
}