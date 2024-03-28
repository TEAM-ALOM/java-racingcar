package domain;

import java.util.*;

public class RacingGame {
    private static Map<String, Integer> cars;
    private int tryCount;

    public RacingGame(){

    }
    public RacingGame(Map<String, Integer> cars, int tryCount){
        carNamesValidate(cars);
        tryCountValidate(tryCount);
        this.cars = cars;
        this.tryCount = tryCount;
    }

    //자동차 distance 업데이트 메소드
    public static void updateDistance(String carName, int random){
        if(random >= 4) {
            int distance = cars.get(carName) + 1;
            cars.replace(carName, distance);
        }
    }

    public Map<String, Integer> getCars() {
        return cars;
    }

    public int getTryCount() {
        return tryCount;
    }

    public static void tryCountValidate(int count){
        if(count <= 0)
            throw new IllegalArgumentException("[ERROR]시도 횟수는 양수입니다.");
    }

    //차이름 유효성 검사 메소드
    public static void carNamesValidate(Map<String, Integer> cars){
        Iterator<String> keys = cars.keySet().iterator();
        while(keys.hasNext()){
            String key = keys.next();
            lengthValidate(key);
        }

    }

    //차 길이 유효성 검사 메소드
    private static void lengthValidate(String name){
        if(name.length() > 5)
            throw new IllegalArgumentException("[ERROR]차 이름은 5자 이하여야합 니다.");
    }

}
