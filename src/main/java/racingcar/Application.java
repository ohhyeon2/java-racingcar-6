package racingcar;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        inputCarName();
    }

    private static void inputCarName() {
        String inputCarName = Console.readLine();
    }

    private static int inputTryCount() {
        int tryCount = Integer.parseInt(Console.readLine());
        return tryCount;
    }
}
