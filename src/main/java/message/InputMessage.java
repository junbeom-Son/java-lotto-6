package message;

public enum InputMessage {
    PURCHASE_AMOUNT_MESSAGE("구입금액을 입력해 주세요.");

    String message;

    InputMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
