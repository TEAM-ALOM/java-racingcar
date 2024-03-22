package view;

import utils.IntegerParser;
import utils.StringParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;


public class InputView {
    //string 상수
    private static final String READ_NAMES_MESSAGE = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    private static final String READ_COUNT_MESSAGE = "시도할 회수는 몇회인가요?";

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    //사용자로부터 자동차 이름 입력받는 매서드, 반환이 List<String>,예외처리
    public static List<String> readCarNames() throws IOException {
        System.out.println(READ_NAMES_MESSAGE);
        String input = bufferedReader.readLine(); //그냥 형식
        return StringParser.splitByComma(input);
    }

    //시도할 횟수를 입력받는다
    public static int readAttemptNumber() throws IOException {
        try{
            System.out.println(READ_COUNT_MESSAGE);
            String input = bufferedReader.readLine();
            return IntegerParser.parse(input);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return readAttemptNumber(); //재귀적, 사용자가 유효한 입력을 제공할 떄까지 반복
        }
    }
    
}
