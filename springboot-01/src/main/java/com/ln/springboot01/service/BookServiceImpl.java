package com.ln.springboot01.service;


import com.ln.springboot01.mapper.BookMapper;
import com.ln.springboot01.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookMapper mapper;

    @Override
    public Book getBookById(Integer id){
        return mapper.selectByPrimaryKey(id);
    }
}
