package com.example.java_guides_new;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // it contains @Controller & @ResponseBody as inbuilt
public class HelloWorldController {
    // going to write rest api



        // get http method
        // http://localhost:8080/hello-world
    @GetMapping("/hello-world")
    public String display(){
        return "Welcome";
    }
}
