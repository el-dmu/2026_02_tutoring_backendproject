package com.dongyag.BackendProject.Controller;

import com.dongyag.BackendProject.Controller.dto.GreetingResponse;
import com.dongyag.BackendProject.service.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    @GetMapping("/api/hello")
    public GreetingResponse hello(@RequestParam(name = "name") String name){
        String message = greetingService.createMessage(name);
        return new GreetingResponse(name, message);
    }
}
