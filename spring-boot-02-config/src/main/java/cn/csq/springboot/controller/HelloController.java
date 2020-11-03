package cn.csq.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author csq
 * @date 2020/11/3 15:38:07
 */
@RestController
public class HelloController {


    @Value("${person.lastName}")
    private String name;

    @GetMapping("/sayHello")
    public String sayHello() {
        return "Hello " + name;
    }
}
