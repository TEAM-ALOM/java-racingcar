package Domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Parser {
    public Parser(){}

    public List<String> stringParserByComma(String input){ //,를 기준으로 리스트 나누기
        ArrayList<String> Output = new ArrayList<>(Arrays.asList(input.split(",")));

        return Output;

    }

}
