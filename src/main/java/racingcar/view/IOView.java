package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;

public final class IOView implements ConsoleView{
    public void showSingleMessage(final String message) {
        System.out.println(message);
    }

    public void showMessages(final List<String> message) {
        message.forEach(System.out::println);
    }

    public void showHeadMessage(final String givenMessage) {
        System.out.print(givenMessage);
    }
    public String readUserInput() {
        return Console.readLine();
    }
}
