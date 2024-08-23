package com.sparta.springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api")
@Controller
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello world!!";
    }


    @GetMapping("/get")
    @ResponseBody
    public String get() {
        return "get method 요청";
    }


    @PostMapping("/post")
    @ResponseBody
    public String post() {
        return "Post method 요청";
    }

    @PutMapping("/put")
    @ResponseBody
    public String put() {
        return "put method 요청";
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public String delete() {
        return"Delete method 요청";
    }

}
