package com.dongyang.BackendProject.exception.code;

import com.dongyang.BackendProject.global.apiPayload.code.BaseSuccessCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ProductSuccessCode implements BaseSuccessCode {

    CREATED(HttpStatus.CREATED, "PRODUCT201_1", "상품 등록 완료"),
    LIST_OK(HttpStatus.OK, "PRODUCT200_1", "상품 목록 조회 완료"),
    DETAIL_OK(HttpStatus.OK, "PRODUCT200_2", "상품 조회 완료"),
    SEARCH_OK(HttpStatus.OK, "PRODUCT200_3", "상품 검색 완료");

    private final HttpStatus status;
    private final String code;
    private final String message;
}
