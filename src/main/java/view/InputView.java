package view;

import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import lotto.Unit;
import message.Symbol;
import validator.InputValidator;

public class InputView {

    public static int getPurchaseAmountInput() {
        while (true) {
            OutputView.printPurchaseAmountInputMessage();
            String input = Console.readLine();
            try {
                InputValidator.validatePurchaseAmountInput(input);
                return Integer.parseInt(input) / Unit.PURCHASE_AMOUNT_UNIT.getUnit();
            } catch (IllegalArgumentException e) {
                OutputView.printErrorMessage(e.getMessage());
                System.out.println();
            }
        }
    }

    public static List<Integer> getWinningNumbers() {
        while (true) {
            OutputView.printWinningNumbersInputMessage();
            String input = Console.readLine();
            try {
                InputValidator.validateWinningNumbersInput(input);
                return Arrays.stream(input.split(Symbol.COMMA.getSymbol()))
                        .map(Integer::parseInt)
                        .sorted()
                        .collect(Collectors.toList());
            } catch (IllegalArgumentException e) {
                OutputView.printErrorMessage(e.getMessage());
                System.out.println();
            }
        }
    }
}
