package controller;

import model.Car;
import model.RacingCars;

import java.util.ArrayList;
import java.util.*;


public class RacingGame {
    final private static String str1 = "실행 결과";
    private static RacingCars cars;
    private static int tryCount;
    public RacingGame(ArrayList<String> carNames, int tryCount){
        cars = new RacingCars(carNames);
        this.tryCount = tryCount;
    }

    public static int getTryCount(){
        return tryCount;
    }
    private int getRandomNumber(){
        return new Random().nextInt(10);
    }
    private void racing(){
        for (Car c : cars.getList()) {
            int n = getRandomNumber();
            if(n > 3)
                c.move();
            c.printNow();
        }
        System.out.println();
    }
    private  void updateResult(){
        for(Car c : cars.getList())
            if(c.getDist() == tryCount)
                c.win();
    }
    public void race(){
        System.out.println(str1);
        for(int i=0;i<tryCount;i++){
            racing();
        }
        updateResult();
    }

    public ArrayList<String> getWinners(){
        ArrayList<String> results = new ArrayList<>();
        for(Car c : cars.getList())
            if(c.getResult())
                results.add(c.getCarName());

        return results;
    }

}
