package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test1")
public class TestController {
    //mapping   method,handler method
    @GetMapping
    public String test1(){
        return "test1";
    }
}
