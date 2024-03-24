package View;

import utils.StringParser;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class InputView {  //사용자에게 입력 받는 객체

    private static final String READ_CAR_NAME = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분.)";
    private static final String READ_ATTEMP_NUM = "시도할 회수는 몇회인가요?";
    private static final Scanner scanner = new Scanner(System.in);

    public static List<String> CarNames() throws IOException{
        System.out.println(READ_CAR_NAME);
        String name = scanner.nextLine();        //문자열 입력 받고
        return StringParser.splitByComma(name);  //콤마 단위로 나누어 저장
    }
    public static int AttemptNum() throws IOException{
        try{
            System.out.println(READ_ATTEMP_NUM);
            int input;
            input = Integer.parseInt(scanner.next()); //시도 횟수 입력 받아 정수로 저장
            return input;
        }
        catch(Exception e){
            System.out.println("정수로 다시 입력해주세요");
            return AttemptNum();
        }
    }

}
