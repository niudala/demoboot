package com.ln.springboot01.mapper;

import com.ln.springboot01.model.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {
    int deleteByPrimaryKey(Integer bookId);

    int insert(Book record);

    Book selectByPrimaryKey(Integer bookId);

    List<Book> selectAll();

    int updateByPrimaryKey(Book record);
}