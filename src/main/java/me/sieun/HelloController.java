package me.sieun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello, " + helloService.getName();
    }//ModelAndView가 null

    @GetMapping("/sample")
    public String sample(){
        return "sample";
    } //ResponseBody가 없이 문자열 리턴 -> 뷰 이름으로 인식
    //ModelAndView가 null이 아님

}
