package com.sparta.springmvc.html;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {

    private static long visitCount = 0;

    //templates없고 static폴더만있을 경우 --> controller view return 값 -> static 폴더
    @GetMapping("/static-hello")
    public String hello() {
        return "hello.html";
    }

//templates 있으면 return값 static으로 안감 --> redirect로 static으로 return가능
    @GetMapping("/html/redirect")
        public String htmlStatic(){
            return "redirect:/hello.html"; //localhost 생략 가능
    }


// templats로 return값 가는데 .html 생략가능
    @GetMapping("/html/templates")
    public String htmlTemplates() {
        return "hello";
    }

// model에 db담고 return값에 view담음
    @GetMapping("/html/dynamic")
    public String htmlDynamic(Model model) {
        visitCount++;
        model.addAttribute("visits", visitCount);
        return "hello-visit";
    }


}
