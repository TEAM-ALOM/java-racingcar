package controller;

import model.domain.RacingGame;

import view.InputView;
import view.ResultView;

import java.util.*;

public class Controller {
    private List<RacingGame> carList = new ArrayList<>();


    public void run() {
        carList = getCarList(InputView.makeCarList(InputView.inputCarName()));
        int tn = InputView.inputTryNum();
        race(tn, carList);
        finalWinner(carList);
    }

    public List<RacingGame> getCarList(List<String> name) {
        List<RacingGame> result = new ArrayList<>();
        for (String carname : name) {
            carList.add(new RacingGame(carname));//**************
        }
        return carList;

    }

    public void race(int tn, List<RacingGame> carList) {
        for (int i = 0; i < tn; i++) {
            randNum(carList);
        }
    }

    private void randNum(List<RacingGame> carList) {//랜덤하게 번호 뽑는 것 외부에서 사용할 일 없어 private으로
        for (int i = 0; i < carList.size(); i++) {
            carList.get(i).move();
        }
        ResultView.result(carList);
    }

    public void finalWinner(List<RacingGame> carList) {
        List<String> str;
        str = findWinCars(carList);
        ResultView.printWinner(str);

    }

    public List<String> findWinCars(List<RacingGame> carList) {


        List<String> ans = new ArrayList<>();
        int max = findMaxPos(carList);
        for (int i = 0; i < carList.size(); i++) {
            if (max <= carList.get(i).getPos()) {//위치가 max와 같거나 큰 경우 ans 리스트에 저장하게됨
                ans.add(carList.get(i).getCarName());//위치 최대인 차들의 이름을 저장함
            }
        }
        return ans;
    }

    public int findMaxPos(List<RacingGame> carList) {
        Collections.sort(carList, new CarComparator());//오름 차순 정렬
        return carList.get(0).getPos();//위치가 가장 큰 값 반환
    }

    class CarComparator implements Comparator<RacingGame> {//pos값을 기준으로 오름차순 정렬(위치가 가장 큰 값을 0번 인덱스에서 얻어내기위함)

        public int compare(RacingGame c1, RacingGame c2) {
            if (c1.getPos() > c2.getPos())
                return -1;
            if (c1.getPos() < c2.getPos())
                return 1;
            return 0;
        }
    }
}