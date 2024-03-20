package domain;

import java.util.Random;

public class Car {
    private String name;
    private int progress;

    public Car(String name){
        this.name = name;
        this.progress = 0;
    }
    public void carProgress(){
        Random random = new Random();
        if(random.nextInt(10)>=4)
            progress += 1;
    }

    public String getName(){
        return name;
    }
    public int getProgress(){
        return progress;
    }


}
