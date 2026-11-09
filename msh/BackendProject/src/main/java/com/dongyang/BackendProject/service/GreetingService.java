package com.dongyang.BackendProject.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String createMessage(String name) {
        return name + "님,안녕하세요";
    }
}
