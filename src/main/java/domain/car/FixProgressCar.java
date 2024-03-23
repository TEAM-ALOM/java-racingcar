package domain.car;

import java.util.Random;

public class FixProgressCar implements Car{
    private String name;
    private int progress;
    public FixProgressCar(){
    }
    public FixProgressCar(String name){
        this.name = name;
        this.progress = 0;
    }
    public Car returnCar(String name){
        return new FixProgressCar(name);
    }
    public void excuteProgressOrStopCar(){
        // 이름의 글자가 3보다 작거나 같으면 이동,크면 정지로 설정.
        int random = 0;
        if(name.length()<=3){
            random=5;
        }
        if(random>=4)
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
