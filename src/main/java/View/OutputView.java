package View;
//View는 Model에만 의존
public class OutputView {
    private static final String LINE_SEPARATOR = System.lineSeparator();
    private static final String RESULT_MESSAGE = "실행 결과";
    private static final String STATUS_PRINT_FORMAT = "%s : %s" + LINE_SEPARATOR;
    private static final String WINNER_PRINT_FORMAT = "%s가 최종 우승했습니다." + LINE_SEPARATOR;
    private static final String WORD_DELIMITER = ", ";
    private static final String POSITION_SYMBOL = "-";

    public static void printResult() {
        System.out.println(RESULT_MESSAGE);
    }



}
