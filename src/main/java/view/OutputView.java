package view;

import dto.CarDto;
import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.stream.Collectors;

public class OutputView {
    private static final String LINE_SEPERATOR = System.lineSeparator();

    private static final String RESULT_MESSAGE = "실행 결과";

    private static final String STATUS_PRINT_FORMAT = "%s : %s" + LINE_SEPERATOR;

    private static final String WINNER_PRINT_FORMAT = "%s가 최종 우승했습니다." + LINE_SEPERATOR;

    private static final String WORD_DELIMITER = ", ";

    private static final String POSITION_SYMBOL = "-";

    public static void printResult(){
        System.out.println(RESULT_MESSAGE); //실행결과
    }

    public static void printStatus(final List<CarDto> carDtos){
        for(CarDto carDto : carDtos){
            String currentPosition = getCurrentPosition(carDto.getPosition());
            System.out.printf(STATUS_PRINT_FORMAT, carDto.getName(), currentPosition);
        }
        System.out.println();
    }

    private static String getCurrentPosition(final int position){
        return POSITION_SYMBOL.repeat(Math.max(0,position)); //max 음수 방지, repeat 지정 횟수만큼 반복
    }

    public static void printWinners(final List<CarDto> carDtos) {
        List<String> carNames = carDtos.stream()
                .map(CarDto::getName)
                .collect(Collectors.toList());
        String winners = String.join(WORD_DELIMITER, carNames);
        System.out.printf(WINNER_PRINT_FORMAT, winners);
    }
}


