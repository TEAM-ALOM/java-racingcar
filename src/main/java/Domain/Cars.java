package Domain;

import View.Output;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Cars {

    private List<Car> CarList;

    public Cars(List<String> CarNames){
        CarList = setCarList(CarNames);
    }

    private List<Car> setCarList(List<String> CarNames){
        List<Car> myCarList = new ArrayList<>();
        for(String CarName:CarNames){
            myCarList.add(new Car(CarName,0));
        }

        return myCarList;
    }

    public List<Car> getCarList(){
        return CarList;
    }

    private void playOnce(){
        RandomNumber randomNumber = new RandomNumber();
        for(Car car:CarList){
            car.move(randomNumber.getRandomNumber());
        }
    }

    public void playGame(int AttemptAmount){
        Output output = new Output();
        System.out.println("실행 결과");
        for(int i=0;i<AttemptAmount;i++){
            playOnce();
            output.outCurrentSituation(CarList);
            output.outEnter();
        }

    }
    private Integer findHigherNumber(int a1, int a2){
        int HigherNumber = 0;
        if(a1 >= a2){
            HigherNumber = a1;
        }
        else if(a1 <= a2){
            HigherNumber = a2;
        }
        return HigherNumber;
    }

    public Integer findHighestNumber(){
        int HighestNumber = 0;
        for(Car car:CarList){
            HighestNumber = findHigherNumber(HighestNumber,car.getPosition());
        }
        return HighestNumber;
    }

    private List<Car> findWinner(){
        int HighestNumber = findHighestNumber();

        List<Car> Winner = CarList.stream()
                .filter(car -> car.isPosition(HighestNumber) == true)
                .collect(Collectors.toList());
        return Winner;
    }

    public List<String> getWinner(){
        List<String> Winners = new ArrayList<>();
        for(Car car:findWinner()){
            Winners.add(car.getName());
        }
        return Winners;
    }










}
