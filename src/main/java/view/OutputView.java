package view;

import static java.text.MessageFormat.format;

import java.util.List;
import java.util.stream.Collectors;
import domain.Car;

public class OutputView {

    private static final String RESULT_MESSAGE = "\n실행 결과";
    private static final String POSITION_MESSAGE_FORMAT = "{0} : {1}";
    private static final String POSITION_MARK = "-";
    private static final String POSITION_MESSAGE_PARSER = "\n";
    private static final String WINNERS_MESSAGE_FORMAT = "{0}가 최종 우승했습니다.";
    private static final String WINNERS_MESSAGE_PARSER = ", ";
    private static final String ERROR_MESSAGE = "[ERROR] ";

    public void printResultMessage() {
        System.out.println(RESULT_MESSAGE);
    }

    public void printCurrentCarPositions(final List<Car> cars) {
        System.out.println(generatePositionMessages(cars) + POSITION_MESSAGE_PARSER);
    }

    private String generatePositionMessages(final List<Car> cars) {
        return cars.stream()
                .map(this::generatePositionMessage)
                .collect(Collectors.joining(POSITION_MESSAGE_PARSER));
    }

    private String generatePositionMessage(final Car car) {
        return format(
                POSITION_MESSAGE_FORMAT,
                car.getName(),
                POSITION_MARK.repeat(car.getPosition())
        );
    }

    public void printWinnersMessage(final List<String> winners) {
        String winnersMessage = String.join(WINNERS_MESSAGE_PARSER, winners);
        System.out.println(format(WINNERS_MESSAGE_FORMAT, winnersMessage));
    }

    public void printErrorMessage(final String message) {
        System.out.println(ERROR_MESSAGE + message);
    }
}