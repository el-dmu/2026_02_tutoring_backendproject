package com.dongyang.BackendProject.Controller;

import com.dongyang.BackendProject.Controller.dto.ProductCreateRequest;
import com.dongyang.BackendProject.Controller.dto.ProductResponse;
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
    public ResponseEntity<ProductResponse> create(
            @RequestBody ProductCreateRequest request
    ) {
       ProductResponse response = productService.create (request);

       return ResponseEntity.status(HttpStatus.CREATED)
               .body(response);
    }

    @GetMapping
    public ResponseEntity<List<ProductResponse>> findAll() {
        return ResponseEntity.ok(productService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductResponse> findbyid(@PathVariable("id") Long id) {
        ProductResponse response = productService.findById(id);
        return ResponseEntity.ok(response);
    }
}
