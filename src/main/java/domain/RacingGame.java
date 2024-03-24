package domain;

import view.OutputView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.random.RandomGenerator;

public class RacingGame {
    String[] carNames;
    String[] tmpCarNames;
    int carCnt;
    int tryCount;
    int[] carMoveRecord;

    public RacingGame(String str, int cnt) {
        this.tmpCarNames = str.split(",");
        carNames = nameError();
        this.carCnt = carNames.length;
        this.tryCount = cnt;
        carMoveRecord = new int[carCnt];
        for(int i = 0; i < carCnt; i++)
        {
            carMoveRecord[i] = 0;
        }
    }

    public void race() {
        for (int i = 0; i < tryCount; i++)
        {
            getRandomForCarMove();
            OutputView.moveCarResult(carNames, carMoveRecord);
        }
        getWinners();
    }

    public void getRandomForCarMove()
    {
        for(int i = 0; i < carCnt; i++) {   // 전진: true
            if (canMove(RandomGenerator.getDefault().nextInt(10))) {
                carMoveRecord[i]++;
            }
        }
    }

    public boolean canMove(int num)
    {
        return num >= 4;
    }

    public List<String> getWinners() {
        int winnerRecord = Arrays.stream(carMoveRecord).max().getAsInt();
        List<String> winnerName = new ArrayList<String>();

        for (int i = 0; i < carMoveRecord.length; i++)
        {
            if (winnerRecord == carMoveRecord[i])
            {
                winnerName.add(carNames[i]);
            }
        }
        return winnerName;
    }

    public String[] nameError()
    {
        int idx = 0;
        List<String> validCarNames = new ArrayList<>();
        for (String s : tmpCarNames)
        {
            if (s.length() <= 5)    // 길이 5이하만 자동차 이름 등록
            {
                validCarNames.add(s);
            }
        }
        return validCarNames.toArray(new String[0]);
    }

}
