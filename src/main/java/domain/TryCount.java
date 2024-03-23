package domain;

public class TryCount {

    private static final String NOT_POSITIVE_INTEGER_MESSAGE = "시도 횟수는 양의 정수여야 합니다";
    private static final int MINIMUM_COUNT = 1;

    private int tryCount;

    public TryCount(int tryCount) {
        validate(tryCount);
        this.tryCount = tryCount;
    }

    private void validate(int tryCount) {
        if (tryCount <= 0) {
            throw new IllegalArgumentException(NOT_POSITIVE_INTEGER_MESSAGE);
        }
    }

    public void decrease() {
        tryCount--;
    }

    public boolean isRemain() {
        return tryCount >= MINIMUM_COUNT;
    }

    public int getTryCount() {
        return tryCount;
    }
}
