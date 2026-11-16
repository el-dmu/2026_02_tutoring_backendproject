package com.dongyang.BackendProject.service;

import com.dongyang.BackendProject.converter.ProductConverter;
import com.dongyang.BackendProject.dto.ProductCreateRequest;
import com.dongyang.BackendProject.dto.ProductResponse;
import com.dongyang.BackendProject.entity.Product;
import com.dongyang.BackendProject.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public ProductResponse create(ProductCreateRequest request) {
        if(request.name() == null || request.name().isBlank() ||
        request.price() == null || request.price() < 0 || request.stock() == null
        || request.stock() < 0) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "상품명과 0 이상의 가격/재고를 입력하세요.");
        }

        Product product = ProductConverter.toEntity(request);
        Product saved = productRepository.save(product);

        return ProductConverter.toResponse(saved);
    }

    public List<ProductResponse> findAll() {
        return productRepository.findAll().stream()
                .map(ProductConverter::toResponse)
                .toList();
    }

    public ProductResponse findById(Long id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND,
                        "상품을 찾을 수 없습니다."
                ));

        return ProductConverter.toResponse(product);
    }
}
