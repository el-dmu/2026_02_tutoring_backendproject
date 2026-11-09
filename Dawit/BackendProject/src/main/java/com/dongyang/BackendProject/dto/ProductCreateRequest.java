package com.dongyang.BackendProject.dto;

public record ProductCreateRequest(
        String name,
        Integer price,
        Integer stock
) {
}
