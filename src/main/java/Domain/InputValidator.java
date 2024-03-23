package Domain;

import java.util.List;

public class InputValidator {
    public InputValidator(){}
    /*
    시도 횟수 > 0

    이름 길이 < 6
    이름 존재
    이름 미중복
    */

    private static final String INVALID_ATTEMPT_AMOUNT_MESSAGE = "시도 횟수가 1보다 적습니다.";
    private static final String INVALID_NAME_LENGTH_MESSAGE = "이름이 6글자 이상입니다.";
    private static final String INVALID_NAME_PRESENT_MESSAGE = "이름이 없는 차가 입력되었습니다.";
    private static final String INVALID_NAME_DUPLICATION_MESSAGE = "중복 이름이 존재합니다.";
    private static final int VALID_ATTEMPT_AMOUNT_LOWER_BOUND = 1;
    private static final int VALID_NAME_LENGTH_UPPER_BOUND = 5;



    public void validateAttemptAmount(int AttemptAmount){ //시도 회수 1이상인지 검증
        if(AttemptAmount < VALID_ATTEMPT_AMOUNT_LOWER_BOUND){
            throw new IllegalArgumentException(INVALID_ATTEMPT_AMOUNT_MESSAGE);
        }
    }
    public void validateName(String name){
        if(name.isEmpty()){ //이름 존재여부 검증
            throw new IllegalArgumentException(INVALID_NAME_PRESENT_MESSAGE);
        }
        if(name.length() > VALID_NAME_LENGTH_UPPER_BOUND){ //이름 길이 충족여부 검증
            throw new IllegalArgumentException(INVALID_NAME_LENGTH_MESSAGE);
        }
    }
    public void validateNameDuplication(List<String> CarList){ //이름 중복 여부 검증
        if(CarList.size() != CarList.stream().distinct().count()){
            throw new IllegalArgumentException(INVALID_NAME_DUPLICATION_MESSAGE);
        }
    }

}
