package com.cybersoft.demospringboot02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
    -Annotation Định nghĩa đường dẫn
        + @Conntroller: định nghĩa đường dẫn được dùng để trả ra nội dung html.(muốn trả ra String phải sử dụng @ResponseBody)
        + @RestController: định nghĩa đường dẫnn, nội dung trả về String chuyên dùng để viết API.

 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("")
    public String hello(){
        return "Hello Spring Boot";
    }

    @GetMapping("/cybersoft")
    public String helloCybersoft(){
        return "<h1>Hello cybersoft</h1>";
    }
}
