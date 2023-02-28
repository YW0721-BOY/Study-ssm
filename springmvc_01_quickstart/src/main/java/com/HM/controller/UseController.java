package com.HM.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UseController {
    @RequestMapping("/save")
    @ResponseBody
    public String save(){
        System.out.println("user save ……");
        return "{'module':'springmvc'}";
    }
}
