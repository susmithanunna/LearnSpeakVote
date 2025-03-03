package com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWorld {
    @GetMapping("/")
    public String find(){
        return "userList";
    }
}
