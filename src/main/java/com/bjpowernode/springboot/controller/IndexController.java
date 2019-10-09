package com.bjpowernode.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Author:Darren
 * 2019/9/26 0026
 */
@Controller
public class IndexController {

    //返回字符串或者json
    @RequestMapping("/boot/index")
    @ResponseBody
    public String index(){
        return "SpringBoot war";
    }

    //跳转页面
    @GetMapping("/boot/jsp")
    public String jsp(Model model){
        model.addAttribute("data", "SpringBoot war---Jsp");
        return "abc";
    }
}
