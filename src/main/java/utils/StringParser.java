package utils;

import java.util.*;
public class StringParser {
    public static List<String> splitByComma(final String input){  //문자열을 ','기준으로 분리하여 저장하는 메서드
        String[] split = input.split(",");
        return Arrays.asList(split);
    }
}
