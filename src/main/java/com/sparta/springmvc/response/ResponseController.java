package com.sparta.springmvc.response;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/response")
@Controller
public class ResponseController {

    //Content-Type : text/html
    //Response Body
    // {"name":"Roobie", "age":95}
    @GetMapping("/json/string")
    @ResponseBody
    public String helloStringJson() {
        return "{\"name\":\"Robbie\",\"age\":95}"; //일부러 json형태로 맞춰줌
    }


    //Content-Type : application/json
    //Response Body
    // {"name":"Roobie", "age":95}
    @GetMapping("/json/class")
    @ResponseBody
    public Star helloClassJson(){
        return new Star("Robbie",95); //spring에서 객체를 json으로 알아서 변환해준다.
    }




}
