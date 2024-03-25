package utils;

//정수로 변환하는 클래스
public class IntegerParser {
    private static final String NOT_INTEGER = "입력값은 정수여야 합니다.";

    private static int parse(final String input){ //문자열을 입력받아 정수로 변환하는 parse
        try{
            return Integer.parseInt(input); //Integer.parseInt: 변환 함수
        }catch (NumberFormatException e){ //실패하면
            throw new IllegalArgumentException(NOT_INTEGER,e);
        }
    }
}
