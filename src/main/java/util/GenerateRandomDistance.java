package util;

import domain.RacingGame;

import java.util.Map;
import java.util.Random;

public class GenerateRandomDistance {

    public static void generateRandomDistance(Map<String, Integer> cars){
        for(Map.Entry<String, Integer> entry : cars.entrySet()){
            Random random = new Random();
            int randomNum = random.nextInt(10);
            RacingGame.updateDistance(entry.getKey(), randomNum);
        }
    }
}
