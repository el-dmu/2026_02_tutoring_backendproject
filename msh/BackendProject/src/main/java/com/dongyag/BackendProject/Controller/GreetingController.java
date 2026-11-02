package com.dongyag.BackendProject.Controller;

import com.dongyag.BackendProject.Controller.dto.GreetingResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/api/hello")
    public GreetingResponse hello(@RequestParam(name = "name") String name){
        return new GreetingResponse(name, name + "님, 안녕");
    }
}
