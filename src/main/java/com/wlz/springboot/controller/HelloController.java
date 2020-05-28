package com.wlz.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@ResponseBody 注解表示将数据返回给 浏览器  可以单独放在一个方法上（如果是对象会转成json数据）
/*@ResponseBody
@Controller*/
//@RestController 是上面两个注解的结合体，主要是做数据返回
@RestController
public class HelloController {


    @RequestMapping("/hello")
    public String hello(){
        return "sptingboot quick!";
    }
}
