package com.HM.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UseController {

    @RequestMapping("/commonParam")
    @ResponseBody
    public String commonParam(){
        return "{'module':'common param'}";
    }
}
