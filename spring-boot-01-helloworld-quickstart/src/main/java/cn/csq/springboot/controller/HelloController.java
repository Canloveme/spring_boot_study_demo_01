package cn.csq.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author csq
 * @date 2020/11/3 13:07:43
 */
@Controller
public class HelloController {


    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello Spring Boot QuickStart !";
    }
}
