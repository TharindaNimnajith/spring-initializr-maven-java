package com.example.springinitializrmavenjava;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class HelloWorldAPI {

    @GetMapping("hello")
    String sayHello() {
        return "Hello World!";
    }

}
