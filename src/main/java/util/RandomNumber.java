package util;

import java.util.Random;

public class RandomNumber {
    public RandomNumber(){}

    public int getRandomNumber(){ //0~10사이의 랜덤번호
        Random random = new Random();
        return random.nextInt(10);
    }
}
