package com.bjpowernode.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpSession;

/**
 * Author:Darren
 * 2019/10/9 0009
 */
@RestController
public class SessionController {
    @GetMapping("/boot/set")
    public String setSession(HttpSession session){
        session.setAttribute("hello", "hello Session");
        return "ok";
    }

    @GetMapping("/boot/get")
    public String getSession(HttpSession session){
        String hello = (String) session.getAttribute("hello");
        return hello;
    }
}
