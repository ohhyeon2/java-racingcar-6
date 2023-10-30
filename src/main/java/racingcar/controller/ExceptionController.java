package racingcar.controller;

import java.util.HashMap;
import racingcar.Constant;

public class ExceptionController {

    public static void carNameMaxLengthException(String[] carNameArr) {
        for (String userCar : carNameArr) {
            if (userCar.length() > Constant.MAX_CAR_NAME_SIZE) {
                throw new IllegalArgumentException("자동차의 이름은 5글자를 초과할 수 없습니다.");
            }
        }
    }

    public static void carNameDuplicateException(HashMap<String, String> carName, String[] carNameArr) {
        if (carName.size() != carNameArr.length) {
            throw new IllegalArgumentException("중복된 이름의 차량이 존재합니다.");
        }
    }

    public static void stringBlankException(String carName) {
        if (carName.replaceAll("\\s", "").length() != carName.length()) {
            throw new IllegalArgumentException("공백을 제외한 문자열을 입력해주세요.");
        }
    }

    public static int tryCountNotIntException(String tryCount) {
        try {
            return Integer.parseInt(tryCount);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자 외에 다른 문자는 사용할 수 없습니다.");
        }
    }
}
