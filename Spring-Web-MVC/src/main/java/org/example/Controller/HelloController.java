package org.example.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {
    public HelloController(){
        System.out.println("Hello Controller constructor");
    }
    @GetMapping
    public String hello(){
        return "hello";
    }
    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
