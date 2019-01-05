package com.example.demo.DemoController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Dell on 03/01/2019.
 */
@RestController
public class Demo {
    @GetMapping("/index")
    public String index(){
        return "hello jenkins";
    }
}
