package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/try")
    public String index() {
        return "try"; // 返回的 "index" 是视图名称
    }
}