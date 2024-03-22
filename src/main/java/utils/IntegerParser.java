package utils;

public class IntegerParser {
    //문자열을 정수로 파싱하는 클래스
    private static final String NOT_INTEGER_MESSAGE = "[ERROR] 입력 값은 정수여야 합니다.";

    public static int parse(final String input){
        try{
            return Integer.parseInt(input); //input 받은거 정수로 변환
        }catch (NumberFormatException e){
            throw new IllegalArgumentException(NOT_INTEGER_MESSAGE, e);
        }
    }
}
