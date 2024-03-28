package domain;

public class RacingGame {
    String Winners;
    String carNames;
    int tryCount;


    public String getWinners() {
        return Winners;
    }
    public RacingGame(String acarNames, Integer atryCount){
        carNames = acarNames;
        tryCount = atryCount;
    }
}
