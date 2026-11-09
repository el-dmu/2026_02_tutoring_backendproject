package com.dongyang.BackendProject.Controller.dto;

public record ProductResponse(
        Long id,
        String name,
        Integer price,
        Integer stock
) {

}
