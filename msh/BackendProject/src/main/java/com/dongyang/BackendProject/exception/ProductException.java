package com.dongyang.BackendProject.exception;

import com.dongyang.BackendProject.exception.code.ProductErrorCode;
import com.dongyang.BackendProject.global.apiPayload.exception.GeneralException;

public class ProductException extends GeneralException {
    public ProductException(ProductErrorCode code) {
        super(code);
    }
}
