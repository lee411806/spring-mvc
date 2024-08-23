package com.sparta.springmvc.response;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//restcontroller -> responsebody애너테이션을 달지 않아도 자동으로 적용됨
@RestController
@RequestMapping("/response/rest")
public class ResponseRestController {
    // [Response header]
    //   Content-Type: text/html
    // [Response body]
    //   {"name":"Robbie","age":95}
    @GetMapping("/json/string")
    public String helloStringJson() {
        return "{\"name\":\"Robbie\",\"age\":95}";
    }

    // [Response header]
    //   Content-Type: application/json
    // [Response body]
    //   {"name":"Robbie","age":95}
    @GetMapping("/json/class")
    public Star helloClassJson() {
        return new Star("Robbie", 95);
    }
}