package com.dongyang.BackendProject.exception.code;

import com.dongyang.BackendProject.global.apiPayload.code.BaseErrorCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ProductErrorCode implements BaseErrorCode {

    INVALID_PRODUCT_INPUT(HttpStatus.BAD_REQUEST,
            "PRODUCT400_1", "상품명과 0 이상의 가격/재고를 입력하세요"),
    EMPTY_SEARCH_KEYWORD(HttpStatus.BAD_REQUEST,
            "PRODUCT400_2", "검색어를 입력하세요"),
    PRODUCT_NOT_FOUND(HttpStatus.NOT_FOUND,
            "PRODUCT404_1", "상품을 찾을 수 없습니다");

    private final HttpStatus status;
    private final String code;
    private final String message;
}
