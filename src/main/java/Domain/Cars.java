package Domain;

import util.InputValidator;
import View.Output;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {

    private List<Car> CarList;

    public Cars(List<String> CarNames){
        CarList = setCarList(CarNames);
    }

    private List<Car> setCarList(List<String> CarNames){ //List<String>을 List<Car> 로 전환
        InputValidator inputValidator = new InputValidator();

        inputValidator.validateNameDuplication(CarNames);

        List<Car> myCarList = new ArrayList<>();
        for(String CarName:CarNames){
            myCarList.add(new Car(CarName,0));
        }

        return myCarList;
    }

    public List<Car> getCarList(){
        return CarList;
    }

    private void playOnce(){ //게임 한번 실행
        RandomNumber randomNumber = new RandomNumber();
        for(Car car:CarList){
            car.move(randomNumber.getRandomNumber());
        }
    }

    public void playGame(int AttemptAmount){ //AttemptAmount만큼 게임 실햄
        Output output = new Output();
        System.out.println("실행 결과");
        for(int i=0;i<AttemptAmount;i++){
            playOnce();
            output.outCurrentSituation(CarList);
            System.out.println("");
        }

    }
    private Integer findHigherNumber(int a1, int a2){ //두 수중 높은 수
        int HigherNumber = 0;
        if(a1 >= a2){
            HigherNumber = a1;
        }
        else if(a1 <= a2){
            HigherNumber = a2;
        }
        return HigherNumber;
    }

    public Integer findHighestNumber(){ //가장 높은 Position 확인
        int HighestNumber = 0;
        for(Car car:CarList){
            HighestNumber = findHigherNumber(HighestNumber,car.getPosition());
        }
        return HighestNumber;
    }

    private List<Car> findWinner(){ //가장 높은 Position을 가진 차의 목록 확인
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
