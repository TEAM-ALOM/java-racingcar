package controller;

import domain.Car;
import view.InputView;
import view.OutputView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RaceController {
    private List<Car> carList = new ArrayList<>();


    public void run(){
        carList = getCarList(InputView.makeCarList(InputView.inputCarNames()));
        int tot = InputView.totCnt();
        race(tot, carList);
        finalWinner(carList);


    }
    public List<Car> getCarList(List<String> name){
        List<Car>result= new ArrayList<>();
        for(String s : name){
            carList.add(new Car(s));
        }
        return carList;

    }
    public void race(int tot, List<Car> carList){
        for(int i = 0; i < tot; i++){
            randNum(carList);
        }
    }
    private void randNum(List<Car>carList){//랜덤하게 번호 뽑는 것 외부에서 사용할 일 없어 private으로
        for(int i = 0; i < carList.size(); i++){
            carList.get(i).move();
        }
        OutputView.result(carList);
    }
    public void finalWinner(List<Car>carList){
        List<String> str;
        str = findWinCars(carList);
        OutputView.printWinner(str);

    }
    public List<String> findWinCars(List<Car>carList){


        List<String> ans = new ArrayList<>();
        int max = findMaxPos(carList);
        for(int i = 0; i < carList.size(); i++){
            if(max <= carList.get(i).getPos()){//위치가 max와 같거나 큰 경우 ans 리스트에 저장하게됨
                ans.add(carList.get(i).getCname());//위치 최대인 차들의 이름을 저장함
            }
        }
        return ans;
    }
    public int findMaxPos(List<Car> carList){
        Collections.sort(carList,new CarComparator());//오름 차순 정렬
        return carList.get(0).getPos();//위치가 가장 큰 값 반환
    }


}
class CarComparator implements Comparator<Car> {//pos값을 기준으로 오름차순 정렬(위치가 가장 큰 값을 0번 인덱스에서 얻어내기위함)
    public int compare(Car c1, Car c2){
        if(c1.getPos() > c2.getPos())
            return -1;
        if(c1.getPos() < c2.getPos())
            return 1;
        return 0;
    }
}
