package com.sherry.service;

import com.sherry.entity.Book;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by SherryWong on 2016/11/27.
 */

@Repository
public interface BookService {

    int insert(Book book);

    int delete(long bookNum);

    List<Book> queryAll();

    List<Book> queryByName(String bookName);

    Book findOne(long bookNum);

    int updateBook(Book book);
}
