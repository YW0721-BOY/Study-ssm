package com.HM.controller;

import com.HM.domain.Book;
import com.HM.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController{
    @Autowired
    private BookService bookService;

    @PostMapping
    public Result save(@RequestBody Book book) {
        boolean save = bookService.save(book);
        return new Result(save?Code.SAVE_OK:Code.SAVE_ERR,save);
    }

    @PutMapping
    public Result update(@RequestBody Book book) {
        boolean update = bookService.update(book);
        return new Result(update?Code.UPDATE_OK:Code.UPDATE_ERR,update);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        boolean delete = bookService.delete(id);
        return new Result(delete?Code.DELETE_OK:Code.DELETE_ERR,delete);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        Book book = bookService.getById(id);
        Integer code=book!=null?Code.GET_OK:Code.GET_ERR;
        String msg=book!=null?"":"数据查询失败，请重试!";
        return new Result(code,book,msg);
    }

    @GetMapping
    public Result getAll() {
        List<Book> all = bookService.getAll();
        Integer code=all!=null?Code.GET_OK:Code.GET_ERR;
        String msg=all!=null?"":"数据查询失败，请重试!";
        return new Result(code,all,msg);
    }
}
