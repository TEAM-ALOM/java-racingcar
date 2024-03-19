package domain;

public class AttemptNumber {
    private static final String NOT_POSITIVE_INTEGER = "시도 횟수는 양의 정수여야 합니다.";
    //private static final String INVALID_NUMBER_MESSAGE="시도 횟수는 100회 이하여야 합니다.";

    private int attemptNumber;
    public AttemptNumber(final int attemptNumber){
        validate(attemptNumber); //유효성 검사
        this.attemptNumber=attemptNumber;
    }

    private void validate(final int attemptNumber){
        if (attemptNumber <=0){
            throw new IllegalArgumentException(NOT_POSITIVE_INTEGER);
        }
    }

    public void decrease(){//시도횟수 차감
        attemptNumber--;
    }
    public boolean isRemain(){ // attemptNumber이 0되면 false
        return attemptNumber!=0;
    }

    public int getAttemptNumber(){
        return attemptNumber;
    }
}
