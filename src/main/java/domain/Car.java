package domain;

import java.util.Random;

public class Car {
    private String name;
    private int progress;

    public Car(String name){
        this.name = name;
        this.progress = 0;
    }
    public void excuteProgressOrStopCar(){
       Random random = new Random();
        if(random.nextInt(10)>=4)
            progressCar();
    }

    public int progressCar(){
        progress += 1;
        return progress;
    }
    public String getName(){
        return name;
    }
    public int getProgress(){
        return progress;
    }


}
