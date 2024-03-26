package domain;

public class AttemptNumber {
    //시도할 횟수 1~100 사이
    private static final String NOT_POSITIVE_INTEGER_MESSAGE =  "[ERROR] 시도 횟수는 양의 정수여야 합니다.";
    private static final String INVALID_NUMBER_MESSAGE = "[ERROR] 시도 횟수는 100회 이하여야 합니다.";

    private int attemptNumber; //시도횟수

    public AttemptNumber(final int attemptNumber){
        validate(attemptNumber);
        this.attemptNumber = attemptNumber;
    }

    //유효성 검사
    private void validate(final int attemptNumber){
        if(attemptNumber <= 0){
            throw new IllegalArgumentException(NOT_POSITIVE_INTEGER_MESSAGE);
        }
        if(attemptNumber > 100){
            throw new IllegalArgumentException(INVALID_NUMBER_MESSAGE);
        }
    }

    public void decrease() {
        attemptNumber--;
    }
    public boolean isRemain(){
        return attemptNumber != 0;
    }
    public int getAttemptNumber(){
        return attemptNumber;
    }
}
