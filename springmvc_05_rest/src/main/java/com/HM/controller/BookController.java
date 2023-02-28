package com.HM.controller;

import com.HM.domain.Book;
import org.springframework.web.bind.annotation.*;


public class BookController {

    @RequestMapping(value = "/books",method = RequestMethod.POST)
    @ResponseBody
    public String save(@ResponseBody Book book){
        System.out.println("book save ……"+book);
        return "{'module':'book save'}";
    }

    public String delete(@PathVariable Integer id){
        System.out.println("book delete ……"+id);
        return "{'module':'book delete'}";
    }
}
