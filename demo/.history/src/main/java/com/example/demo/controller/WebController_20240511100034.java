package com.example.demo.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/index")
    public String index(Model model) {
        // String cssContent = readFileContent("htmlpage_first_model/css/style.css");
        // model.addAttribute("style", cssContent);     

        // cssContent = readFileContent("htmlpage_first_model/css/plugins.css");
        // model.addAttribute("plugins", cssContent);  

        // String imageContent = readFileContent("htmlpage_first_model/img/i12.png");
        // model.addAttribute("i12", imageContent);

        // imageContent = readFileContent("htmlpage_first_model/img/wechat-group-3.png");
        // model.addAttribute("wechat-group-3", imageContent);

        return "htmlpage_first_model/index"; // 返回的 "index" 是视图名称
    }

    private String readFileContent(String fileName) {
        try {
            // 读取文件内容
            File file = new File("src/main/resources/templates/" + fileName);
            StringBuilder content = new StringBuilder();
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
            reader.close();
            return content.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return "Error reading file";
        }
    }
}