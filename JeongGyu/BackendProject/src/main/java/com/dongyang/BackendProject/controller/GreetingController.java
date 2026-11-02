package com.dongyang.BackendProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/api/hello")
    public String hello(
            @RequestParam(name = "name") String name
    ) {
        return name + "님, 안녕하세요!";
    }

}
