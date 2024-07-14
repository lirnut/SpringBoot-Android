package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("css", "<style>body {background-color: red;}</style>");
        model.addAttribute("image", "<img src='data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAUA...' alt='My Image'>");
        return "htmlpage_first_model/index"; // 返回的 "index" 是视图名称
    }
}