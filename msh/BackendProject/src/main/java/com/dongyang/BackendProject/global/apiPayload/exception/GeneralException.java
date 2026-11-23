package com.dongyang.BackendProject.global.apiPayload.exception;

import com.dongyang.BackendProject.global.apiPayload.code.BaseErrorCode;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class GeneralException extends RuntimeException {
    private final BaseErrorCode code;
}
