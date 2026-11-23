package com.dongyang.BackendProject.controller;

import com.dongyang.BackendProject.controller.dto.ProductCreateRequest;
import com.dongyang.BackendProject.controller.dto.ProductResponse;
import com.dongyang.BackendProject.exception.code.ProductSuccessCode;
import com.dongyang.BackendProject.global.apiPayload.ApiResponse;
import com.dongyang.BackendProject.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping
    public ResponseEntity<ApiResponse<ProductResponse>> create(
            @RequestBody ProductCreateRequest request
    ) {
       ProductResponse result = productService.create (request);
       ProductSuccessCode code = ProductSuccessCode.CREATED;

       return ResponseEntity.status(code.getStatus())
               .body(ApiResponse.onSuccess(code, result));
    }

    @GetMapping
    public ResponseEntity<ApiResponse<List<ProductResponse>>> findAll() {
        List<ProductResponse> result = productService.findAll();
        ProductSuccessCode code = ProductSuccessCode.LIST_OK;
        return ResponseEntity.status(code.getStatus())
                .body(ApiResponse.onSuccess(code, result));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<ProductResponse>> findById(
            @PathVariable("id") Long id
    ) {
        ProductResponse result = productService.findById(id);
        ProductSuccessCode code = ProductSuccessCode.DETAIL_OK;

        return ResponseEntity.status(code.getStatus())
                .body(ApiResponse.onSuccess(code, result));
    }

    @GetMapping("/search")
    public ResponseEntity<ApiResponse<List<ProductResponse>>> search(
            @RequestParam("name") String name
    ){
        List<ProductResponse> result = productService.search(name);
        ProductSuccessCode code = ProductSuccessCode.SEARCH_OK;

        return ResponseEntity.status(code.getStatus())
                .body(ApiResponse.onSuccess(code, result));
    }
}
