package com.example.account.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    INTERNAL_SERVER_ERROR("내부 서버 오류가 발생했습니다."),
    ACCOUNT_NOT_FOUND("계좌가 존재하지 않습니다."),
    TRANSACTION_NOT_FOUND("해당 거래가 존재하지 않습니다."),
    ACCOUNT_ALREADY_UNREGISTERED("이미 해지된 계좌입니다."),
    USER_ACCOUNT_NOT_MATCH("계좌의 소유주와 사용자가 다릅니다."),
    USER_NOT_FOUND("사용자가 없습니다."),
    MAX_ACCOUNT_PER_USER_10("사용자 별 최대 계좌 갯수는 10개 입니다."),
    BALANCE_NOT_EMPTY("계좌잔액이 존재합니다."),
    AMOUNT_EXCEED_BALANCE("거래금액이 잔액보다 큽니다."),
    CANCEL_MUST_FULLY("부분취소는 허용되지 않습니다."),
    TOO_OLD_ORDER_CANCEL("1년이 지난 거래는 취소가 불가능합니다."),
    INVALID_REQUEST("잘못된 요청입니다."),
    TRANSACTION_ACCOUNT_UN_MATCH("이거래는 해당 계좌에서 발생한 거래가 아닙니다.");
    private String description;
}
