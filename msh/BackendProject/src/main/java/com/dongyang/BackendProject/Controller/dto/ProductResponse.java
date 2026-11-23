package com.dongyang.BackendProject.controller.dto;

public record ProductResponse(
        Long id,
        String name,
        Integer price,
        Integer stock
) {

}
