package com.dongyang.BackendProject.Controller.dto;

public record ProductCreateRequest(
        String name,
        Integer price,
        Integer stock
        // int 기본값은 0, Integer 기본값은 null
) {

}
