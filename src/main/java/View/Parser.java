package View;

import java.util.ArrayList;
import java.util.List;

public class Parser {
    public Parser(){}

    public List<String> stringParserByComma(String input){
        ArrayList<String> Output = new ArrayList<>();
        for(String list:input.split(",")){
            Output.add(list);
        }

        return Output;

    }

}
