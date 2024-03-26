package domain;

import java.util.Random;

public class RandomNumberGenerator implements NumberGenerator{
    private static final int NUMBER_MAX_BOUND = 10;
    private final Random random = new Random();
    @Override
    public int generate() {
        return random.nextInt(NUMBER_MAX_BOUND);
    }
}
