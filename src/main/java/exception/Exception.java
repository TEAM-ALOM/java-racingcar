package exception;

public class Exception {
    private static String CAR_NAME_LENGTH_LIMITS_STATEMENTS="자동차 이름의 길이는 1자이상 5자이하여야합니다.";
    private static String CAR_GAME_TRYNUMBER_LIMITS_STATEMENTS="자동차 경주 횟수는 양수여야합니다.";
    public static void validateNameLength(String name){
        validateNameLengthMin(name);
        validateNameLengthMax(name);
    }
    public static void  validateNameLengthMax(String name) {
        if(name.length()>5){
            throw new IllegalArgumentException(CAR_NAME_LENGTH_LIMITS_STATEMENTS);
        }
    }
    public static void  validateNameLengthMin(String name) {
        if(name.length()<=0){
            throw new IllegalArgumentException(CAR_NAME_LENGTH_LIMITS_STATEMENTS);
        }
    }
    public static void validateTryNumber(int tryNumber){
        if(tryNumber<=0)
            throw new IllegalArgumentException(CAR_GAME_TRYNUMBER_LIMITS_STATEMENTS);
    }

}
