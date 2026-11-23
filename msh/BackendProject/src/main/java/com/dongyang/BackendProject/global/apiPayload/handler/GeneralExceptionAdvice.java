package com.dongyang.BackendProject.global.apiPayload.handler;

import com.dongyang.BackendProject.global.apiPayload.ApiResponse;
import com.dongyang.BackendProject.global.apiPayload.code.BaseErrorCode;
import com.dongyang.BackendProject.global.apiPayload.code.GeneralErrorCode;
import com.dongyang.BackendProject.global.apiPayload.exception.GeneralException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GeneralExceptionAdvice {
    @ExceptionHandler(GeneralException.class)
    public ResponseEntity<ApiResponse<Void>> handleGeneralException(
            GeneralException exception
    ){
        BaseErrorCode code = exception.getCode();
        return ResponseEntity.status(code.getStatus())
                .body(ApiResponse.onFailure(code));
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiResponse<Void>> handleUnexpectedException(
            Exception exception
    ){
        log.error("요청 처리 중 예외 발생", exception);
        GeneralErrorCode code = GeneralErrorCode.INTERNAL_SERVER_ERROR;
        return ResponseEntity.status(code.getStatus())
                .body(ApiResponse.onFailure(code));
    }
}
