package com.dongyang.BackendProject.converter;

import com.dongyang.BackendProject.dto.ProductCreateRequest;
import com.dongyang.BackendProject.dto.ProductResponse;
import com.dongyang.BackendProject.entity.Product;

public class ProductConverter {

    // 상품 등록 요청 DTO -> Entity 변환
    public static Product toEntity(ProductCreateRequest request) {
        return Product.builder()
                .name(request.name())
                .price(request.price())
                .stock(request.stock())
                .build();
    }

    // Product Entity -> 응답 DTO 변환
    public static ProductResponse toResponse(Product product) {
        return new ProductResponse(
                product.getId(),
                product.getName(),
                product.getPrice(),
                product.getStock()
        );
    }
}
