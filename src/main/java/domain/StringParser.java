package domain;

import java.util.List;

public class StringParser {
    public List<String> SplitByComma(String input){
        List<String> carNameList = List.of(input.split(","));
        return carNameList;
    }
}
