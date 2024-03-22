package domain.car;

import java.util.Random;

public class RandomProgressCar implements Car {
    private String name;
    private int progress;
    public RandomProgressCar(){

    }
    public RandomProgressCar(String name){
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

    @Override
    public Car returnCar(String name) {
        return new RandomProgressCar(name);
    }


}
