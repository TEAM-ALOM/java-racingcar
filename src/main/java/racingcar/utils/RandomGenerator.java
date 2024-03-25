package racingcar.utils;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomGenerator {
    private static final int RANDOM_MIN = 0;
    private static final int RANDOM_MAX = 9;
    public static int getRandomMoveSize() {
        return Randoms.pickNumberInRange(RANDOM_MIN, RANDOM_MAX);
    }
}
