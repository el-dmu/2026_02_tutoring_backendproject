package com.dongyang.BackendProject.exception.code;

import com.dongyang.BackendProject.global.apiPayload.code.BaseSuccessCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ProductSuccessCode implements BaseSuccessCode {

    CREATED(HttpStatus.CREATED, "PRODUCT201_1", "상품이 등록되었습니다."),
    LIST_OK(HttpStatus.OK, "PRODUCT200_1", "상품 목록을 조회했습니다."),
    DETAIL_OK(HttpStatus.OK, "PRODUCT200_2", "상품을 조회했습니다."),
    SEARCH_OK(HttpStatus.OK, "PRODUCT200_3", "상품을 검색했습니다.");

    private final HttpStatus status;
    private final String code;
    private final String message;
}
