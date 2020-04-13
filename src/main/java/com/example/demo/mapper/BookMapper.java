package com.example.demo.mapper;

import com.example.demo.entity.BookEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface BookMapper {
    BookEntity selectBook(int id);
}
