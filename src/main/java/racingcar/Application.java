package racingcar;

import java.util.HashMap;
import java.util.List;

import racingcar.controller.RacingGameController;
import racingcar.view.RacingGameView;

public class Application {
    public static void main(String[] args) {
        String carName = RacingGameView.inputCarName();

        HashMap<String, String> car = RacingGameController.carNameAndForwardStatus(carName);

        String tryCount = RacingGameView.inputTryCount();
        int intTryCount = RacingGameView.stringTryCountToInteger(tryCount);

        RacingGameView.gameResultMessage();
        for (int i = 0; i < intTryCount; i++) {
            RacingGameController.moveForward(car);
            RacingGameView.forwardResult(car);
        }

        List<String> mostForwardCarList = RacingGameController.mostMoveForwardCar(car);
        RacingGameView.winner(mostForwardCarList);
    }
}