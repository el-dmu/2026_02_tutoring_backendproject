package com.dongyang.BackendProject.global.apiPayload;

import com.dongyang.BackendProject.global.apiPayload.code.BaseErrorCode;
import com.dongyang.BackendProject.global.apiPayload.code.BaseSuccessCode;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"isSuccess", "code", "message", "result"})
public record ApiResponse<T>(
        @JsonProperty("isSuccess") boolean isSuccess,
        @JsonProperty("code") String code,
        @JsonProperty("message") String message,
        @JsonProperty("result") T result) {
    public static <T> ApiResponse<T> onSuccess(
            BaseSuccessCode code, T result
    ){
        return new ApiResponse<>(true, code.getCode(), code.getMessage(), result);
    }

    public static ApiResponse<Void> onFailure(BaseErrorCode code){
        return new ApiResponse<>(false, code.getCode(), code.getMessage(), null);
    }
}
