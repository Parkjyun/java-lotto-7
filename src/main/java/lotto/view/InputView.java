package lotto.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public String getPrice() {
        System.out.println(ViewMessage.AMOUNT_OF_MONEY.getMessage());
        String amount = Console.readLine();
        validateNull(amount);
        return amount;
    }

    private void validate(final String input) {
        validateNull(input);
        validateBlank(input);
    }

    private void validateNull(final String input) {
        if (input == null) {
            throw new IllegalArgumentException(ErrorMessage.NULL_INPUT.getMessage());
        }
    }

    private void validateBlank(final String input) {
        if (input.isBlank()) {
            throw new IllegalArgumentException(ErrorMessage.BLANK_INPUT.getMessage());
        }
    }
}

