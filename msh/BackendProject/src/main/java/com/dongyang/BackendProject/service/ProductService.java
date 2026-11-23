package com.dongyang.BackendProject.service;

import com.dongyang.BackendProject.controller.dto.ProductCreateRequest;
import com.dongyang.BackendProject.controller.dto.ProductResponse;
import com.dongyang.BackendProject.exception.ProductException;
import com.dongyang.BackendProject.exception.code.ProductErrorCode;
import com.dongyang.BackendProject.repository.ProductRepository;
import com.dongyang.BackendProject.converter.ProductConverter;
import com.dongyang.BackendProject.entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    @Transactional
    public ProductResponse create(ProductCreateRequest request){
        if(request.name() == null || request.name().isBlank() ||
        request.price() == null || request.price() < 0 ||
        request.stock() == null || request.stock() < 0){
            throw new ProductException(ProductErrorCode.INVALID_PRODUCT_INPUT);
        }
        Product product = ProductConverter.toEntity(request);
        Product saved = productRepository.save(product);

        return ProductConverter.toResponse(saved);
    }

    public List<ProductResponse> findAll(){
        return productRepository.findAll().stream()
                .map(ProductConverter::toResponse)
                .toList();
    }

    public ProductResponse findById(Long id){
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ProductException(ProductErrorCode.PRODUCT_NOT_FOUND));
        return ProductConverter.toResponse(product);
    }

    public List<ProductResponse> search(String name){
        if(name.isBlank()){
            throw new ProductException(ProductErrorCode.EMPTY_SEARCH_KEYWORD);
        }

        return productRepository.findByNameContaining(name)
                .stream()
                .map(ProductConverter::toResponse)
                .toList();
    }
}
