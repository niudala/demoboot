package com.ln.springboot01.controller;


import com.ln.springboot01.model.Book;
import com.ln.springboot01.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookController {

    @Autowired
    private BookService service;


    @GetMapping("/book/{id}")
    @ResponseBody
    public Book getBookById(@PathVariable("id") Integer id){

        Book book = service.getBookById(id);
        return book;
    }
}
