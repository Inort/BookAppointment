package com.example.demo.service;

import com.example.demo.entity.BookEntity;
import com.example.demo.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    BookMapper bookMapper;

    public BookEntity selectBook(int id) {
        return bookMapper.selectBook(id);
    }

}
