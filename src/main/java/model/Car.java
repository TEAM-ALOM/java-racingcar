package model;

import java.util.ArrayList;

public class Car {
    final private String carName;
    private int dist = 0;
    private boolean result = false;
    public Car(String carName){
        this.carName = carName;
    }
    public String getCarName(){
        return carName;
    }

    public void move(){
        dist++;
    }
    public int getDist(){
        return dist;
    }
    public void printNow(){
        System.out.print(carName + " : ");
        for(int i=0;i<dist;i++)
            System.out.print("-");
        System.out.println();
    }
    public void win(){
        result = true;
    }
    public boolean getResult(){
        return result;
    }
}
