package com.example.JspStart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.service.annotation.GetExchange;

@Controller
public class IndexController {

    @GetMapping("/")
    public String indexPage(){
        return "index";
    }
}
