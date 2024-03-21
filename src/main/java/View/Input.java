package View;


import java.util.List;
import java.util.Scanner;

public class Input {

    private static final Scanner scanner = new Scanner(System.in);

    public Input(){}

    public List<String> readCarNames(){
        Parser parser = new Parser();
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String InputCarNames = scanner.nextLine();

        return parser.stringParserByComma(InputCarNames);

    }

    public Integer readAttemptAmount(){
        System.out.println("시도할 회수는 몇회인가요?");
        return scanner.nextInt();
    }

    private boolean validateAmount(int AttemptAmount){
        return AttemptAmount > 0;
    }

}
