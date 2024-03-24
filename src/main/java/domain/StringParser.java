package domain;

import java.util.List;

public class StringParser {
    public static List<String> SplitByComma(String input) {
        List<String> carNames = List.of(input.split(","));
        return carNames;
    }
}
