package com.example.demo.controller;

import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/BookList")
@Controller
public class BookController {

    @Autowired
    BookService bookService;

    @RequestMapping("/hello")
    public String showHello() {
        return "hello!";
    }

    @RequestMapping("/getBook/{id}")
    @ResponseBody
    public String showBooks(@PathVariable int id) {
        return bookService.selectBook(id).toString();
    }

}
