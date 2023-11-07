package message;

public enum OutputMessage {

    PURCHASE_FINISHED_MESSAGE("개를 구매했습니다."),
    STATISTICS_HEADER_MESSAGE("당첨 통계\n---"),
    MATCHED_COUNT_MESSAGE("개 일치"),
    BONUS_NUMBER_MATCH_MESSAGE(", 보너스 볼 일치");

    String message;

    OutputMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
